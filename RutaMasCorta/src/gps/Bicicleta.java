public static String rutaCorta(int [] camino1, int [] camino2, int [] camino3)
{
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    
    for(int i=0; i<camino1.length; i++)
    {
        sum1 += camino1[i];
    }
    for(int i=0; i<camino2.length; i++)
    {
        sum2 += camino2[i];
    }
    for(int i=0; i<camino3.length; i++)
    {
        sum3 += camino3[i];
    }
    
    if(sum1 < sum2 && sum1 < sum3)
    {
        return "camino 1"; 
    }else if(sum2 < sum3 && sum2 < sum1)
    {
        return "camino 2";
    }else if(sum3 < sum1 && sum3 < sum2)
    {
        return "camino 3";
    }else{
        if(sum1 == sum2 && sum2 == sum3)
        {
            return "camino 1, 2 y 3";
        }else if(sum1 == sum3)
        {
            return "caminos 1 y 3";
        }else if(sum2 == sum3){
            return "caminos 2 y 3";
        }else{
            return "caminos 1 y 2";
        }
    }
    
}
