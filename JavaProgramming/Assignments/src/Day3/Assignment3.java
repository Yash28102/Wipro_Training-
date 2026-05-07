package Day3;
import java.util.Arrays;

public class Assignment3 {
public static void main(String[] args) {


// 1. Sort array ascending & descending
int arr[] = {5,2,8,1,3};

Arrays.sort(arr);
System.out.println("1. Ascending: " + Arrays.toString(arr));

System.out.print("1. Descending: [");
for(int i=arr.length-1;i>=0;i--){
System.out.print(arr[i]+" ");
}
System.out.println("]");

// Output:
// 1. Ascending: [1, 2, 3, 5, 8]
// 1. Descending: [8 5 3 2 1 ]




// 2. Remove duplicates
int arr2[] = {1,2,2,3,4,4,5};

System.out.print("2. ");
for(int i=0;i<arr2.length;i++){
boolean duplicate=false;
for(int j=i+1;j<arr2.length;j++){
if(arr2[i]==arr2[j]){
duplicate=true;
break;
}
}
if(!duplicate)
System.out.print(arr2[i]+" ");
}
System.out.println();

// Output:
// 2. 1 2 3 4 5 




// 3. Largest in each row
int matrix[][]={
{1,5,3},
{9,2,8},
{4,6,7}
};

for(int i=0;i<matrix.length;i++){
int max=matrix[i][0];
for(int j=1;j<matrix[i].length;j++){
if(matrix[i][j]>max)
max=matrix[i][j];
}
System.out.println("3. Row "+i+" Largest: "+max);
}

// Output:
// 3. Row 0 Largest: 5
// 3. Row 1 Largest: 9
// 3. Row 2 Largest: 7




// 4. Array palindrome
int arr3[]={1,2,3,2,1};
boolean flag=true;

for(int i=0;i<arr3.length/2;i++){
if(arr3[i]!=arr3[arr3.length-1-i]){
flag=false;
break;
}
}

if(flag)
System.out.println("4. Palindrome");
else
System.out.println("4. Not Palindrome");

// Output:
// 4. Palindrome




// 5. Rotate matrix 90 degree
int mat[][]={
{1,2,3},
{4,5,6},
{7,8,9}
};

int n=mat.length;
int rotate[][]=new int[n][n];

for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
rotate[j][n-1-i]=mat[i][j];
}
}

System.out.println("5. Rotated Matrix:");
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
System.out.print(rotate[i][j]+" ");
}
System.out.println();
}

// Output:
// 5. Rotated Matrix:
// 7 4 1
// 8 5 2
// 9 6 3


}
}