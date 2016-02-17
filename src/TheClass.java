
public class TheClass{
    public TheClass(){
        int sizeOfList = 100;
        int low = 1;
        int hi = 5;
        int[] myArray = new int[sizeOfList];
        for(int i = 0; i<myArray.length; i++){
            myArray[i] = randomIntInclusive(low,hi);
        }
        //now to sort the array
        int[] myArray1 = sort(myArray);
        int[] myArray2 = bubbleSort(myArray);
        
        //check if its sorted
        boolean sorted = true;
        for(int i = 0; i<myArray.length; i++){
            System.out.println(myArray2[i]);
        }
        for(int i = 0; i<myArray.length; i++){
            if(myArray1[i]!=myArray2[i]){
                sorted = false;
                i = myArray.length;
            }
        }
        System.out.println(sorted);
        
    }
    public int randomIntInclusive(int a, int b){
        
        return (int)(Math.random()*b-a+1)+a;
    }
    public int[] sort(int[] inArray){
        ////do your coding here
        return inArray;
    }
    public int[] bubbleSort(int[] inArray){
        ////do your coding here
        boolean cleanPass = false;
        while(!cleanPass){
            cleanPass = true;
            for(int i =0; i<inArray.length-1; i++){
                if(inArray[i] > inArray[i+1]){
                    int temp = inArray[i];
                    inArray[i] = inArray[i+1];
                    inArray[i+1] = temp;
                    cleanPass = false;
                }
            }
        }
        
        return inArray;
    }
    
}
