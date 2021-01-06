package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;

    private List<Skill> skills = new ArrayList<>();

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        if (skills.size() == 0) {

        }
        return skills;
    }

    public void addSkills(String... names) {
        for (String name: names) {
            skills.add(new Skill(findName(name), findLevel(name)));
        }
    }

    private int findLevel(String str) {
        int level = Integer.parseInt(str.substring(str.length()-2, str.length()-1));
        return level;
    }

    private String findName(String str) {
        String name = str.substring(0, str.length()-4);
        return name;
    }

    public int findSkillLevelByName(String name) {
        int level = 0;
        for (Skill skill: skills) {
            if (name.equals(skill.getName())) {
                level = skill.getLevel();
                return level;
            }
        }
        throw new SkillNotFoundException();
    }
}
