package ioprintwriter.talentshow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ResultCalculator {

    private List<Production> productions = new ArrayList<>();
    private List<Vote> votes = new ArrayList<>();

    public List<Production> getProductions() {
        return productions;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void readTalents(Path file) {
       try (BufferedReader br = Files.newBufferedReader(file)) {
           String line;
           while ((line = br.readLine()) != null) {
               String[] temp = line.split(" ");
               productions.add(new Production(Integer.parseInt(temp[0]), temp[1]));
           }
       } catch (IOException e) {
           throw new IllegalStateException("File not found", e);
       }
    }

    public void calculateVotes(Path file) {
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            boolean isAlreadyExist = false;
            while ((line = br.readLine()) != null) {
                isAlreadyExist = false;
                if (votes.isEmpty()) {
                    votes.add(new Vote(Integer.parseInt(line), 1));
                    continue;
                } else {
                    for (Vote vote: votes) {
                        if (vote.getId() == Integer.parseInt(line)) {
                            vote.incNum();
                            isAlreadyExist = true;
                        }
                    }
                    if (isAlreadyExist == false) {
                        votes.add(new Vote(Integer.parseInt(line), 1));
                    }
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("File not found", e);
        }
    }

    public void writeResultToFile(Path file) {
        try (PrintWriter pw = new PrintWriter(Files.newBufferedWriter(file))) {
            for (Production production: productions) {
                for (Vote vote: votes) {
                    if (production.getId() == vote.getId()) {
                        pw.println(vote.getId() + " " +
                                production.getName() + " " +
                                vote.getNumber());
                    }
                }
            }
            pw.print("Winner: " + calculateWinner().getName());
        } catch (IOException e) {
            throw new IllegalStateException("File can not write", e);
        }
    }

    private Production calculateWinner() {
        int votesNumber = 0;
        int productionId = 0;
        Production p = new Production(0, "");
        for (Vote vote: votes) {
            if (vote.getNumber() > votesNumber) {
                votesNumber = vote.getNumber();
                productionId = vote.getId();
            }
        }
        for (Production production: productions) {
            if (production.getId() == productionId) {
                p = production;
            }
        }
        return p;
    }


}
