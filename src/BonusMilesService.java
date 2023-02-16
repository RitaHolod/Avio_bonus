public class BonusMilesService {
    public int calculate (int cost){
        int bonusSize = 20;
        int mile = cost / bonusSize;

        return mile;
    }
}
