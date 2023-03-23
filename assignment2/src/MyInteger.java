public class MyInteger {
    private int value;
    public int getValue(){return value;}

    public MyInteger(int value){
        this.value=value;
    }

    public boolean isEven(){
        if(value%2==0)
            return true;
        return false;
    }

    public boolean isOdd(){
        if(value%2==1)
            return true;
        return false;
    }

    public boolean isPrime(){
        boolean flag = false;
        for (int i=2;i<=value/2;++i){
            if(value%i==0){
                flag = true;
                break;
            }
        }
        if (!flag)
            return true;
        else
            return false;
    }

    public static boolean isEven(int value){
        if(value%2==0)
            return true;
        return false;
    }

    public static boolean isOdd(int value){
        if(value%2==1)
            return true;
        return false;
    }

    public static boolean isPrime(int value){
        boolean flag = false;
        for (int i=2;i<=value/2;++i){
            if(value%i==0){
                flag = true;
                break;
            }
        }
        if (!flag)
            return true;
        else
            return false;
    }

    public static boolean isEven(MyInteger v){
        if(v.value%2==0)
            return true;
        return false;
    }

    public static boolean isOdd(MyInteger v){
        if(v.value%2==1)
            return true;
        return false;
    }

    public static boolean isPrime(MyInteger v){
        boolean flag = false;
        for (int i=2;i<=v.value/2;++i){
            if(v.value%i==0){
                flag = true;
                break;
            }
        }
        if (!flag)
            return true;
        else
            return false;
    }

    public boolean equals(int v){
        if(value==v)
            return true;
        return false;
    }

    public boolean equals(MyInteger v){
        if(value==v.value)
            return true;
        return false;
    }
}
