public class Item
{
    private int test;
    private int myCatNum, myInventory;
    public Item(int nNum, int nInv)
    {
        myCatNum = nNum;
        myInventory = nInv;
    }
    public int getCatNum(){return myCatNum;}
    public int getInventory(){return myInventory;}
}