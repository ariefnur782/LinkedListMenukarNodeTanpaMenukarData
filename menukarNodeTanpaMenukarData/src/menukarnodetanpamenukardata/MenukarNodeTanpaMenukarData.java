/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menukarnodetanpamenukardata;

import jdk.nashorn.internal.ir.WhileNode;

/**
 *
 * @author USER
 */
public class MenukarNodeTanpaMenukarData {
Node head;
static class Node{
    int data;
    Node next;
    
    Node(int d){
        data = d;
        next = null;
    }
}
private void menampilkanPertukarannya (MenukarNodeTanpaMenukarData list){
    list.head = new Node(10);
    Node nodeKeDua = new Node(16);
    Node nodeKeTiga = new Node(21);
    Node nodeKeEmpat = new Node(34);
    Node nodeKeLima = new Node(27);
    Node nodeKeEnam = new Node(9);
    
    list.head.next = nodeKeDua;
    list.head.next.next = nodeKeTiga;
    list.head.next.next.next = nodeKeEmpat;
    list.head.next.next.next.next = nodeKeLima;
    list.head.next.next.next.next.next = nodeKeEnam;
}

private void mencetak(String ini){
    System.out.println(ini);
    Node listNode = head;
    while(listNode != null){
        System.out.println(listNode.data+" ");
        listNode = listNode.next;
    }
    System.out.println("");
    System.out.println("------------------");
    System.out.println("");
}
public static void main(String[]args){
    MenukarNodeTanpaMenukarData list= new MenukarNodeTanpaMenukarData();
    list.menampilkanPertukarannya(list);
    list.mencetak(" ");
    list.mencetak("  jjj");
    list.menukarNode(11,33);
    list.mencetak(" aaaaa");
}
private void menukarNode(int nilaiSatu,int nilaiKedua){
    if(nilaiSatu == nilaiKedua){
        return;
    }
    
    Node melihatSatu = null;
    Node curSatu = head;
    while (curSatu != null && curSatu.data !=nilaiSatu){
    melihatSatu = curSatu;
    curSatu = curSatu.next;
}

    Node melihatDua = null;
    Node curDua = head;
    while (curDua != null && curDua.data != nilaiKedua){
    melihatDua = curDua;
    curDua = curDua.next;
}
if(curSatu == null||curDua ==null ){
return;
}

if(melihatSatu != null){
melihatSatu.next = curDua;
}else{
head = curDua;
}

if( melihatDua != null){
melihatDua.next=curSatu;
}else{
head = curSatu;
}
Node temp = curSatu.next;
curSatu.next = curDua.next;
curDua.next = temp;
}}