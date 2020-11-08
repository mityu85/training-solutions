package references.socialnetwork;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    private List<Member> members = new ArrayList<>();

    private Member findByName(String name){
        for (Member item: members) {
            if (item.getName().equals(name)) {
                return item;
            }
        }
        return null;
    }

    public void addMember(String name){
        members.add(new Member(name));
    }

    public void connect(String name, String otherName){
        Member firstMember = findByName(name);
        Member secondMember = findByName(otherName);
        firstMember.connectMember(secondMember);
    }

    public List<String> bidirectionalConnections() {
        List<String> connectionsList = new ArrayList<>();
        String connections;
        for (Member item: members) {
            for (Member anotherItem: item.getConnections()) {
                if (item.getConnections().contains(anotherItem)) {
                    connections = item.getName() + " - " + anotherItem.getName();
                    connectionsList.add(connections);
                }
            }
        }
        return connectionsList;
    }

    public String toString(){
        return members.toString();
    }

}
