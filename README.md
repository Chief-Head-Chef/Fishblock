# Fishblock

starts out as skyblock.  You are equipped with only a fishing rod, and a small pool

Fishing rods will be made out of different resources.  Rods will retrieve at random anything that rod is capable of retrieving, limited by the type of pool/pond also.
EG: Basic rod can catch wood, stone and dirt fish, unless the pond is a dirt pond, therefore limiting catches to dirtfish.

Tiers so far:
Wood rod (default, provided at start)
Stone rod
Iron rod
Gold rod
Diamond rod
Netherite rod
Enderium rod


Fish available from pool will be tied to capabilities of the rod.  Wood rod eg:
Woodfish
Stonefish
Dirtfish
Stringfish

Tier 2: 


Fisbowls are chests (early game, no automation)
Fish ponds / pools (size dependant) are automated large storage bins


Scan and determine what is a body of water, and what is not
Create an object for each body of water, Object structure:


public class Fish {

//design fish property shit here
}


public class FishPool {
    private int id;
    private boolean isActive;
    private int blockSize;
    private int[][][] poolTop;
    private Fish[];

    // Constructor
    public FishPool(int[][][] blocks) {
        this.blockSize = blocks.length;
        this.poolTop[][][] = findSurface(blocks); //haven't made this function yet
        this.id = /*get last id +1?*/;
    }

    // Default Constructor
    public FishPool() {
        this.id;
        this.isActive = false;
        this.blockSize = /*count the blocks bro*/;
        this.poolTop = /*search highest Z coordinate, find all blocks with matching*/;
        this.Fish = /*NONE*/;
    }

    public int getId() {
        return id;
    }

    // Used to check if the water is even fishable
    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }
}