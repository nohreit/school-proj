package prog_1;

import java.util.Arrays;

public class Movie {
    private String movieName;
    private int numMinutes;
    private boolean isKidFriendly;
    private int numCastMembers;
    private final String[] castMembers;

    public Movie() {
        this("Flick", 0, false, new String[10]);
    }

    public Movie(String movieName, int numMinutes, boolean isKidFriendly, String[] castMembers) {
        this.movieName = movieName;
        this.numMinutes = numMinutes;
        this.isKidFriendly = isKidFriendly;
        numCastMembers = 0;
        this.castMembers = castMembers;
        for (String castMember : castMembers) {
            if (castMember != null) numCastMembers++;
        }
    }

    public void setNumMinutes(int numMinutes) {
        this.numMinutes = numMinutes;
    }

    public int getNumMinutes() {
        return numMinutes;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setIsKidFriendly(boolean isKidFriendly) {
        this.isKidFriendly = isKidFriendly;
    }

    public boolean isKidFriendly() {
        return isKidFriendly;
    }

    public int getNumCastMembers() {
        return numCastMembers;
    }

    public String[] getCastMembers() {
        String[] copyOfCastMembers = new String[castMembers.length];
        System.arraycopy(castMembers, 0, copyOfCastMembers, 0, castMembers.length);
        return copyOfCastMembers;
    }

    public boolean replaceCastMember(int index, String castMemberName) {
        if (index >= 0 && index < numCastMembers) {
            castMembers[index] = castMemberName;
            return true;
        }
        return false;
    }

    public boolean doArraysMatch(String[] arr1, String[] arr2) {
        if (arr1 == null && arr2 == null)
            return true;
        if (arr1 == null || arr2 == null || arr1.length != arr2.length)
            return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equalsIgnoreCase(arr2[i])) return false;
        }
        return true;
    }

    public String getCastMemberNamesAsString() {
        if (numCastMembers == 0) return "none";
        StringBuilder tired = new StringBuilder(); // funny
        for (int i = 0; i < numCastMembers; ++i) {
            tired.append(castMembers[i]).append(i < numCastMembers - 1 ? ", " : "");
        }
        return tired.toString();
    }

    public String toString() {
        return String.format("Movie: [ Minutes %03d | Movie Name: %20s | %s | Number of Cast Members: %d | Cast Members: %s ]",
                numMinutes, movieName, (isKidFriendly() ? "is kid friendly" : "not kid friendly"), numCastMembers, getCastMemberNamesAsString());
    }

    public boolean equals(Object o) {
        if (o instanceof Movie m) {
            return (numMinutes == m.numMinutes) && (movieName.equalsIgnoreCase(m.movieName))
                    && (isKidFriendly == m.isKidFriendly) && (numCastMembers == m.numCastMembers)
                    && doArraysMatch(castMembers, m.castMembers);
        }
        return false;
    }
}
