# include <bits\stdc++.h>

using namespace std;

int main(){
    int n,i,j,temp;
    cout<<"Enter the range of array elements :";
    cin>>n;

    int  array[n];
    cout<<"Enter the elements :\n";
    for(i=0;i<n;i++){
        cout<<"array["<<i<<"]=";
        cin>>array[i];
    }
    cout<<"Beofre sorting : ";
    for(i=0;i<n;i++) {
        cout<<"\t"<<array[i];
    }

    cout<<"\nAfter sorting :";
    for(i=0;i<n-1;i++){
        for(j=0;j<n-1-i;j++){
            if(array[j] > array[j+1]){
                temp = array[j];
                array[j]=array[j+1];
                array[j+1] = temp;
            }
        }
    }
    for(i=0;i<n;i++) {
        cout<<"\t"<<array[i];
    }
}
