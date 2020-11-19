public class SFSUClubDriver {
    public static void main(String[] args) {
        SFSUClub club1 = new SFSUClub();
        SFSUClub club2 = new SFSUClub("Coding Club", 20);

        SFSUClub c1 = new SFSUClub("Black Excellence in STEM", 80);
        SFSUClub c2 = new SFSUClub("Society of Women Engineers", 70);
        SFSUClub c3 = new SFSUClub("ACM", 60);
        SFSUClub[] clubArray = {c1, c2, c3};

        for (SFSUClub club : clubArray) {
            System.out.printf("%s %d%n", club.getName(), club.getNumOfMembers());
        }

        System.out.printf("Average club size: %.2f%n", meanMemberSize(clubArray));
    }

    public static double meanMemberSize(SFSUClub[] clubs) {
        double sum = 0;
        for (SFSUClub club : clubs) {
            sum += club.getNumOfMembers();
        }
        return sum / clubs.length;
    }
}

class SFSUClub {
    private static int numOfClubs;
    private String name;
    private int numOfMembers;

    SFSUClub() {
        numOfClubs++;
    }

    SFSUClub(String name, int numOfMembers) {
        this.name = name;
        this.numOfMembers = numOfMembers;
        numOfClubs++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfMembers() {
        return numOfMembers;
    }

    public void setNumOfMembers(int numOfMembers) {
        this.numOfMembers = numOfMembers;
    }
}