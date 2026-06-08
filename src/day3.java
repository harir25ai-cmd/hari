void main()
{
    int n = 5;
    for(int row = 1;row <= n;row++)
    {
        for(int col = n;col > row-1;col--)
        {
            System.out.print(col);
        }
        System.out.println();
    }
    /*
    54321
    5432
    543
    54
    5
     */
}
