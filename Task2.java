class efficientJanitor {
    public int getMinTrips(int[] arr, int limit) {
        int n = arr.length;
        Arrays.sort(arr);

        boolean[] check = new boolean[n];
        int count = 0;        
        for (int i = n-1; i >= 0; i--) {
            if (check[i]) continue;
            check[i] = true;
            count++;

            int remain = limit - arr[i];
            for (int j = i-1; j >= 0; j--) {
                if (!check[j] && arr[j] <= remain) {
                    remain = remain - arr[j];
                    check[j] = true;
                   
                }
            } 
        }
        
        return count;
    }
}
