#include<stdio.h>
#include<stdlib.h>
#include<conio.h>
struct node
{
	int data;
	struct node *left,*right;

}*root,*temp,*p;
void create(struct node*,struct node*);
void dfs();
int main()
{
	int num,ch;
	do{
		printf("\n1.create\n2.dfs");
		scanf("%d",&ch);
		swith(ch)
		{
			case 1:
				scanf("%d",&num);
				p=(struct node*)malloc(sizeof(struct node));
				p->data=num;
				p->left=NULL;
				p->right=NULL;
				create(p,root);
	
			case 2:

				dfs(root);
		}
	}while(n<=2);
}
void create(struct node *p,struct node *b)
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
				create(p,temp->left);
		}
		else
		{
			if(temp->right==NULL)
				temp->right=p;
			else
				create(p,temp->right);
		}		
		
	}
}
void dfs(struct node *root)
{
	printf("%d->",root->data);
	dfs(root->left);
	dfs(root->right);
}
