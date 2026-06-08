void main()
{
    int [] marks = {87,32,44,89,23};

    System.out.print("pass Marks ");

    for (int mark:marks)
    {
        if(40 < mark) {
            System.out.print(mark+",");
        }

    }
    System.out.println();
    System.out.print("Fail Marks ");

    for (int mark:marks)
    {
        if(40 > mark) {
            System.out.print(mark+",");
        }

    }

}
