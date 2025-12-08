package mastery;

public class Exercise5 {

    private int stones;

    // ✅ Constructor generates 15–30 stones
    public Exercise5() {
        stones = (int)(Math.random() * 16) + 15;
    }

    // ✅ Returns number of stones
    public int getStones() {
        return stones;
    }

    // ✅ Removes stones safely
    public void removeStones(int num) {
        stones = stones - num;
    }
}
