public class FleetOfThings {
    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch
        fleet.add(new Thing("get milk"));
        fleet.add(new Thing("remove the obstacles"));
        Thing finished = new Thing("stand up");
        fleet.add(finished);
        finished.complete();
        Thing finished2 = new Thing("eat lunch");
        fleet.add(finished2);
        finished2.complete();
        System.out.println(fleet);
    }
}
