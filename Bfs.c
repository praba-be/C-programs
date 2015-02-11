#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node *left,*right;

}*root,*temp,*p;
int val, front = 0, rear = -1, i;
int queue[20];
void add(struct node*,struct node*);
void bfs();
int main()
{
	int x,n;
	do{
	printf("\n1.create\n2.bfs");
	scanf("%d",&n);
	if(n==1)
	{
		scanf("%d",&x);
		p=(struct node*)malloc(sizeof(struct node));
		p->data=x;
		p->left=NULL;
		p->right=NULL;
		add(p,root);
	
	}
	if(n==2)
	bfs(root);
	}while(n<=2);
}
void add(struct node *p,struct node *b)
{
	
	if(root==NULL)
	root=p;
	else
	{
		temp=b;
		if(p->data<temp->data)
		{
			if(temp->left==NULL)
				temp->left=p;
			else
				add(p,temp->left);
		}
		else
		{
			if(temp->right==NULL)
				temp->right=p;
			else
				add(p,temp->right);
		}		
		
	}
}
void bfs_traverse(struct node *root)
{
	printf("%d",root->data);	
    if ((front <= rear)&&(root->value == queue[front]))
    {
        if (root->left != NULL)
            queue[++rear] = root->left->value;
        if (root->right != NULL || root->right  ==  NULL)
            queue[++rear] = root->right->value;
        front++;
    }
    if (root->left != NULL)
    {
        bfs_traverse(root->left);
    }
    if (root->right != NULL)
    {
        bfs_traverse(root->right);
    }
}
