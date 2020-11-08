package week02;

import java.util.ArrayList;
import java.util.List;

public class Office {

    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }

    public List<String> printNames() {
        List<String> namesList = new ArrayList<>();
        for (MeetingRoom room: meetingRooms) {
            namesList.add(room.getName());
        }
        return namesList;
    }

    public List<String> printNamesReverse() {
        List<String> namesReverseList = new ArrayList<>();
        for (int i = meetingRooms.size()-1; i >= meetingRooms.indexOf(meetingRooms.get(0)); i--){
            namesReverseList.add(meetingRooms.get(i).getName());
        }
        return namesReverseList;
    }

    public List<String> printEventName(){
        List<String> eventNameList = new ArrayList<>();
        if (meetingRooms.size() >= 2) {
            for (int i = 0; i < meetingRooms.size(); i++) {
                if (i % 2 == 1) {
                    eventNameList.add(meetingRooms.get(i).getName());
                }
            }
            return eventNameList;
        }
        return null;
    }

    public String printAreas() {
        for (MeetingRoom room: meetingRooms) {
            System.out.println(room.getName() + ": " + room.getWidth() + " width, " +
                    room.getLength() + " length, " + room.getArea() + " area.");
        }
        return null;
    }

    public String printMeetingRoomsWithName(String name) {
        for (MeetingRoom room : meetingRooms) {
            if (room.getName().equals(name)) {
                return room.getName() + ": " + room.getWidth() + " width, " +
                        room.getLength() + " length, " + room.getArea() + " area.";
            }
        }
        return null;
    }

    public String printMeetingRoomsContains(String part) {
        List<String> meetingRoomsContainsList = new ArrayList<>();
        for (MeetingRoom room: meetingRooms) {
            if (room.getName().toLowerCase().contains(part.toLowerCase())) {
                return room.getName() + ": " + room.getWidth() + " width, " +
                        room.getLength() + " length, " + room.getArea() + " area.";
                //meetingRoomsContainsList.add(room.getName());
            }
        }
        return null;
    }

    public String printAreasLargerThan(int area) {
        List<MeetingRoom> areasLargerThanList = new ArrayList<>();
        for (MeetingRoom room: meetingRooms) {
            if(room.getArea() > area) {
                areasLargerThanList.add(room);
            }
        }
        for (MeetingRoom item: areasLargerThanList) {
            return item.getName() + ": " + item.getWidth() + " width, " +
                    item.getLength() + " length, " + item.getArea() + " area.";
        }
        return null;
    }

}
