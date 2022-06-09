class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> finalArrayList=new ArrayList<>();
        ArrayList<Integer> prev=new ArrayList<>();
       for(int i=0;i<numRows;i++)
       {
        
           prev.add(0,1);
           for(int index=1;index<prev.size()-1;index++)
           {
               prev.set(index,prev.get(index)+prev.get(index+1));
                   System.out.println("index:"+index+" value:"+prev.get(index));

           }
           finalArrayList.add(new ArrayList<Integer>(prev));
       }
        return finalArrayList;
        
    }
}