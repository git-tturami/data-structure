#include <stdio.h>
#include <stdlib.h>

#include "linked_list.h"

linked_list_t linked_list;

void linked_list_add_first(int data)
{
    node * tmp;
    
    tmp=(node*)malloc(sizeof(node));
    linked_list.size++;
    
    if(linked_list.head==NULL){
        
        linked_list.head=tmp;
        tmp->next=NULL;
        tmp->data=data;
    }
    
    else{
        tmp->next=linked_list.head;
        linked_list.head=tmp;
        tmp->data=data;
    }
    
}

void linked_list_add_last(int data)
{
    node * tmp;
    node * last_node;
    
    tmp=(node*)malloc(sizeof(node));
    last_node=(node*)malloc(sizeof(node));
    
    linked_list.size++;
    tmp=linked_list.head;
    
    while(tmp!=NULL && tmp->next!=NULL)
    {
        tmp=tmp->next;
    }
    
    tmp->next=last_node;
    last_node->data=data;
    last_node->next=NULL;
}

int linked_list_get_first()
{
    node * tmp;
    tmp=(node*)malloc(sizeof(node));
    tmp=linked_list.head->next;
    
    return tmp->data;
}

int linked_list_get_last()
{
    node * tmp;
    
    tmp=(node*)malloc(sizeof(node));
    
    tmp=linked_list.head;
    
    while(tmp!= NULL && tmp->next != NULL){
        tmp=tmp->next;
        
    }
    
    return tmp->data;
}

void linked_list_delete_first()
{
    
    node * tmp=(node*)malloc(sizeof(node));
    
    tmp=linked_list.head;
    
    tmp->next=linked_list.head->next;
    
    linked_list.head=tmp->next;
    
    free(tmp);
    
    linked_list.size--;
    
}

void linked_list_delete_last()
{
    node * tmp=(node*)malloc(sizeof(node));
    
    tmp=linked_list.head;
    
    while(tmp!=NULL && tmp->next!=NULL){
        tmp=tmp->next;
    }
    
    free(tmp);
  
    linked_list.size--;
}

int linked_list_size()
{
    return linked_list.size;
}

int linked_list_exist(int data)
{
    node * tmp=(node*)malloc(sizeof(node));
    
    tmp=linked_list.head;
    
    while(tmp!=NULL && tmp->next !=NULL){
        
        tmp=tmp->next;
        
        if(tmp->data==data)
            return 1;
    }
    return 0;
}

void linked_list_delete(int data)
{
    node * tmp=(node*)malloc(sizeof(node));
    node * prenode=(node*)malloc(sizeof(node));
    
    prenode=linked_list.head;
    
    for(tmp=linked_list.head; tmp!=NULL; tmp=tmp->next){
        
        if(tmp->data==data){
            prenode->next=tmp->next;
            free(tmp);
            break;
            
        }
        prenode=prenode->next;
    }
}

void linked_list_delete_index(int i)
{
    
    int index=0;
    
    node *tmp=(node*)malloc(sizeof(node));
    node *prenode=(node*)malloc(sizeof(node));
    
    prenode=linked_list.head;
    
    for(tmp=linked_list.head;tmp!=NULL;){
        
        if(i==0){
            linked_list.head=tmp->next;
            free(tmp);
            break;
        }
        
        else{
            tmp=tmp->next;
            
            if(i==index){
                prenode->next=tmp->next;
                free(tmp);
                break;
            }
            
            prenode=prenode->next;
            
            if(i>linked_list.size){
                printf("Excess index");
                
            }
            index++;
        }
        
        break;
    }
}

void linked_list_delete_all()
{
    node * tmp=(node*)malloc(sizeof(node));
    
    for(tmp=linked_list.head;tmp!=NULL;){
        
        node * deleteNode=(node*)malloc(sizeof(node));
        
        deleteNode=tmp;
        
        tmp=tmp->next;
        
        free(deleteNode);
    }
    
    free(tmp);
}

void linked_list_print()
{
    node * tmp=(node*)malloc(sizeof(node));
    
    for (tmp = linked_list.head; tmp != NULL; tmp = tmp->next){
        printf("%d\n", tmp->data);
    }
    
}
