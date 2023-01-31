class GfG
{
    int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
      int sum=0;
      int maxl=0;
      for(int i=0;i<arr.length;i++)
          {
            sum+=arr[i];
        if(sum==0)
          maxl=i+1;
        else{
            if(map.get(sum)!=null)
            maxl = Math.max(maxl,i-map.get(sum));
            else
            map.put(sum,i);
        }
          }
          return maxl;
    }}
            
