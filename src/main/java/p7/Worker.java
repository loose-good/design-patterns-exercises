package p7;

class Worker {
   protected int x;
 
   public Worker(int _x) {
       x = _x;
   }
 
   public int makeStuff() {
       int z;
       incrementX();
       z = computeZ();
       System.out.println("Values are:" + x + " and " + z);
       return x + z;
   }

    protected int computeZ() {
        return x * x;
    }

    protected void incrementX() {
        x++;
    }
}
 
class SpecializedWorker extends Worker {
   private int y;
 
   public SpecializedWorker(int _x, int _y) {
       super(_x);
       y = _y;
   }

    @Override
    protected int computeZ() {
        return x * x + y * y;
    }

    @Override
    protected void incrementX() {
        x += y;
    }
}
