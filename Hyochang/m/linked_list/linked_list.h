//
//  linked_list.h
//  linked_list
//
//  Created by hyochang on 2020/08/02.
//  Copyright © 2020 hyochang. All rights reserved.
//

#ifndef linked_list_h
#define linked_list_h

typedef struct node{
    int data;
    struct node *next;
} node;

typedef struct linked_list{
    int size;
    node *head;
} linked_list_t;

void linked_list_add_first(int data);   // add 'data' at the beginning of list
void linked_list_add_last(int data);    // add 'data' at the end of list
int linked_list_get_first();            // return 'data' of first item
int linked_list_get_last();             // return 'data' of last item
void linked_list_delete_first();        // delete first item
void linked_list_delete_last();         // delete last item
int linked_list_size();                 // return the number of items in list
int linked_list_exist(int data);        // find 'data'. return true(1)/false(0)
void linked_list_delete(int data);      // find 'data' in the list, and delete
void linked_list_delete_index(int i);   // delete 'i'-th item in the list
void linked_list_delete_all();          // delete dall data
void linked_list_print();               // print all data in the list

#endif /* linked_list_h */
