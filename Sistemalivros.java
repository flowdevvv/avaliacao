/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
 package sistemalivros;

public class Sistemalivros {

    public static void main(String[] args) {

        Livro1 livro1 = new Livro1("Dom Casmurro", "Machado de Assis", "Romance", 1899, 256, 29.90);
        Livro1 livro2 = new Livro1("1984", "George Orwell", "Ficção Científica", 1949, 328, 39.90);
        Livro1 livro3 = new Livro1("O Hobbit", "J.R.R. Tolkien", "Fantasia", 1937, 310, 45.00);
        Livro1 livro4 = new Livro1("A Revolução dos Bichos", "George Orwell", "Sátira", 1945, 152, 24.90);
        Livro1 livro5 = new Livro1("O Pequeno Príncipe", "Antoine de Saint-Exupéry", "Fábula", 1943, 96, 19.90);
        Livro1 livro6 = new Livro1("Memórias Póstumas de Brás Cubas", "Machado de Assis", "Romance", 1881, 208, 27.50);
        Livro1 livro7 = new Livro1("Harry Potter e a Pedra Filosofal", "J.K. Rowling", "Fantasia", 1997, 223, 49.90);
        Livro1 livro8 = new Livro1("O Senhor dos Anéis", "J.R.R. Tolkien", "Fantasia", 1954, 576, 69.90);
        Livro1 livro9 = new Livro1("Grande Sertão: Veredas", "Guimarães Rosa", "Romance", 1956, 494, 54.90);
        Livro1 livro10 = new Livro1("A Metamorfose", "Franz Kafka", "Ficção", 1915, 96, 21.90);
        Livro1 livro11 = new Livro1("Capitães da Areia", "Jorge Amado", "Romance", 1937, 280, 32.90);
        Livro1 livro12 = new Livro1("Fahrenheit 451", "Ray Bradbury", "Ficção Científica", 1953, 194, 34.90);
        Livro1 livro13 = new Livro1("O Alquimista", "Paulo Coelho", "Ficção", 1988, 163, 29.90);
        Livro1 livro14 = new Livro1("Vidas Secas", "Graciliano Ramos", "Romance", 1938, 176, 25.90);
        Livro1 livro15 = new Livro1("Iracema", "José de Alencar", "Romance", 1865, 120, 22.90);

        livro1.calcularIdade();
        livro2.calcularIdade();
        livro3.calcularIdade();
        livro4.calcularIdade();
        livro5.calcularIdade();
        livro6.calcularIdade();
        livro7.calcularIdade();
        livro8.calcularIdade();
        livro9.calcularIdade();
        livro10.calcularIdade();
        livro11.calcularIdade();
        livro12.calcularIdade();
        livro13.calcularIdade();
        livro14.calcularIdade();
        livro15.calcularIdade();

        livro1.imprimir();
        livro2.imprimir();
        livro3.imprimir();
        livro4.imprimir();
        livro5.imprimir();
        livro6.imprimir();
        livro7.imprimir();
        livro8.imprimir();
        livro9.imprimir();
        livro10.imprimir();
        livro11.imprimir();
        livro12.imprimir();
        livro13.imprimir();
        livro14.imprimir();
        livro15.imprimir();

        // desafio extra - cria mais um livro e altera uma informação depois
        Livro1 livroExtra = new Livro1("Cem Anos de Solidão", "Gabriel García Márquez", "Realismo Mágico", 1967, 417, 44.90);
        livroExtra.calcularIdade();
        livroExtra.imprimir();

        livroExtra.preco = 39.90;
        livroExtra.imprimir();
    }
}
