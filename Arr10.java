class Arr10{
public static void main(String args[]){
int a[]={3,2,5,7};
int large = a[0];
int small = a[0];
for(int i=1;i<a.length;i++){
if(a[i]>large){
large = a[i];}
else if(a[i]<small){
small = a[i];}
}
System.out.println("large:"+large);
System.out.println("small:"+small);
}
}