package Intermediary.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------STACKS-----------");

        Stack<String> pilha = new Stack<>();
        pilha.push("Se quiser sim"); // ADD
        pilha.push("Jacinto Norrego");
        System.out.println("Pilha: " + pilha);
        pilha.pop();// Remove o primeiro da pilha
        System.out.println("Pilha nova : " + pilha);
        System.out.println("Topo da pilha: " + pilha.peek()); // mostra o qual esta no topo
        System.out.println("Tamanho da pilha: " + pilha.size() + " elementos"); // mostra o tamanho da pilha
    }
}
