package assignment4;
import java.util.Scanner;
import java.util.*;
class ques1
{
    public static void main(String[] args)
    {
        int n, m;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        in.nextLine();
        String[] crop_num = new String[n];
        for (int i=0;i<n;i++)
        {
            crop_num[i]=in.nextLine().trim();
        }
        char[][] arr = new char[n][m];//arranging the values input by the user in a 2-D array of size nxm
        for(int i=0; i<n; i++)
        {
            for(int j=0;j<m; j++)
            {
                arr[i][j] = crop_num[i].charAt(j);
            }
        }
        char[] crop_types = new char[26];
        for(char c='a'; c<'z'; c++)
        {
            crop_types[c-'a'] = c;
        }
        System.out.println(replant(arr, 0, 0, n, m, 0, n*m, crop_types));
        in.close();
    }

    public static int replant(char[][] crops_mat, int curr_row, int curr_col, int n, int m, int curr_count, int min_num, char[] crop_types)
    {
        Set<Character> set1 = new HashSet<Character>();//stores the character in the upper and left cell
        if(curr_row!=0)
        {
            set1.add(crops_mat[curr_row-1][curr_col]);
        }
        if(curr_col!=0)
        {
            set1.add(crops_mat[curr_row][curr_col-1]);
        }
        Set<Character> set2 = new HashSet<Character>();//stores the character in the lower and right cell
        if(curr_row!=n-1)
        {
            set2.add(crops_mat[curr_row+1][curr_col]);
        }
        if(curr_col!=m-1)
        {
            set2.add(crops_mat[curr_row][curr_col+1]);
        }
        boolean present_left_up = false;
        if(set1.contains(crops_mat[curr_row][curr_col]))
        {
            present_left_up = true;
        }
        char[][] new_crops_mat = new char[n][m];
        if(set2.contains(crops_mat[curr_row][curr_col]))
        {
            if(present_left_up)
            {
                for(int k=0; k<26; k++)
                {
                    if(!set1.contains(crop_types[k]) && !set2.contains(crop_types[k]))
                    {
                        for(int i=0; i<n; i++)
                        {
                            for(int j=0;j<m;j++)
                            {
                                new_crops_mat[i][j] = crops_mat[i][j];
                            }
                        }
                        new_crops_mat[curr_row][curr_col] = crop_types[k];
                        if(curr_col<m-1)
                        {
                            min_num = Math.min(min_num, replant(new_crops_mat, curr_row, curr_col+1, n, m, curr_count+1, min_num, crop_types));
                        }
                        else if(curr_row<n-1)
                        {
                            min_num = Math.min(min_num, replant(new_crops_mat, curr_row+1, 0, n, m, curr_count+1, min_num, crop_types));
                        }
                        else
                        {
                            return Math.min(curr_count+1, min_num);
                        }
                        break;
                    }
                }
            }
            else
            {
                if(curr_col<m-1)
                {
                    min_num = Math.min(min_num, replant(crops_mat, curr_row, curr_col+1, n, m, curr_count, min_num, crop_types));
                }
                else if(curr_row<n-1)
                {
                    min_num = Math.min(min_num, replant(crops_mat, curr_row+1, 0, n, m, curr_count, min_num, crop_types));
                }
                else
                {
                    return Math.min(curr_count, min_num);
                }
                for(int k=0; k<26;k++)
                {
                    if(!set1.contains(crop_types[k]) && !set2.contains(crop_types[k]))
                    {
                        for(int i=0; i<n; i++)
                        {
                            for(int j=0; j<m; j++)
                            {
                                new_crops_mat[i][j] = crops_mat[i][j];
                            }
                        }
                        new_crops_mat[curr_row][curr_col] = crop_types[k];
                        if(curr_col<m-1)
                        {
                            min_num = Math.min(min_num, replant(new_crops_mat, curr_row, curr_col+1, n, m, curr_count+1, min_num, crop_types));
                        }
                        else if(curr_row<n-1)
                        {
                            min_num = Math.min(min_num, replant(new_crops_mat, curr_row+1, 0, n, m, curr_count+1, min_num, crop_types));
                        }
                        else
                        {
                            return Math.min(curr_count+1, min_num);
                        }
                        break;
                    }
                }

            }
        }
        else
        {
            if(present_left_up)
            {
                for(int k=0; k<26;k++)
                {
                    if(!set1.contains(crop_types[k]) && !set2.contains(crop_types[k]))
                    {
                        for(int i=0; i<n; i++)
                        {
                            for(int j=0;j<m;j++)
                            {
                                new_crops_mat[i][j] = crops_mat[i][j];
                            }
                        }
                        new_crops_mat[curr_row][curr_col] = crop_types[k];
                        if(curr_col<m-1)
                        {
                            min_num = Math.min(min_num, replant(new_crops_mat, curr_row, curr_col+1, n, m, curr_count+1, min_num, crop_types));
                        }
                        else if(curr_row<n-1)
                        {
                            min_num = Math.min(min_num, replant(new_crops_mat, curr_row+1, 0, n, m, curr_count+1, min_num, crop_types));
                        }
                        else
                        {
                            return Math.min(curr_count+1, min_num);
                        }
                        break;
                    }
                }
            }
            else
            {
                if(curr_col<m-1)
                {
                    min_num = Math.min(min_num, replant(crops_mat, curr_row, curr_col+1, n, m, curr_count, min_num, crop_types));
                }
                else if(curr_row<n-1)
                {
                    min_num = Math.min(min_num, replant(crops_mat, curr_row+1, 0, n, m, curr_count, min_num, crop_types));
                }
                else
                {
                    return Math.min(curr_count, min_num);
                }
            }
        }
        return min_num;
    }
    
}