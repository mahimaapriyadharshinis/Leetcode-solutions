class Solution {
    public boolean lemonadeChange(int[] bills) {
        int l = bills.length;
        int flag = 1;
        int[] arr = new int[l];

        for (int i = 0; i < l; i++) {
            arr[i] = -1;
        }

        for (int j = 0; j < l; j++) {
            if (bills[j] == 5) {
                arr[j] = 5;
            } 
            else if (bills[j] == 10) {
                boolean found5 = false;
                for (int k = 0; k < l; k++) {
                    if (arr[k] == 5) {
                        arr[k] = -1;
                        found5 = true;
                        break;
                    }
                }
                if (!found5) return false;
                arr[j] = 10;
            } 
            else if (bills[j] == 20) {
                boolean used10 = false;
                boolean used5 = false;

                // try to use one 10
                for (int k = 0; k < l; k++) {
                    if (arr[k] == 10) {
                        arr[k] = -1;
                        used10 = true;
                        break;
                    }
                }

                // try to use one 5
                for (int k = 0; k < l; k++) {
                    if (arr[k] == 5) {
                        arr[k] = -1;
                        used5 = true;
                        break;
                    }
                }

                if (used10 && used5) {
                    arr[j] = 20;
                } else {
                    // rollback if needed
                    if (used10) {
                        for (int k = 0; k < l; k++) {
                            if (arr[k] == -1) {
                                arr[k] = 10;
                                break;
                            }
                        }
                    }
                    if (used5) {
                        for (int k = 0; k < l; k++) {
                            if (arr[k] == -1) {
                                arr[k] = 5;
                                break;
                            }
                        }
                    }

                    // try to use three 5s
                    int count5 = 0;
                    for (int k = 0; k < l && count5 < 3; k++) {
                        if (arr[k] == 5) {
                            arr[k] = -1;
                            count5++;
                        }
                    }
                    if (count5 < 3) return false;
                    arr[j] = 20;
                }
            }
        }
        return true;
    }
}
