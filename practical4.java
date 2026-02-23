  static void oneofyourMethods(int n,int[] anyArr,int target){
      static int linearsearch(int[] anyArr, int target){
         for(int i=0;i<=anyArr.length-1;i++){
            if(anyArr[i]==target){return target;}
         }
         return -1;
      }
      static int binarysearch(int[] anyArr,int target){
         int end= anyArr.length-1;
         int start;
         int midNum= (start+end)/2;
         while(start<=end){
            if(anyArr[midNum]==target){return midNum;}
            else if (anyArr[midNum]<target){start=midNum+1;}
            else{end=midNum-1;} 
            }
      }
         return-1;
      }
   }
   }
