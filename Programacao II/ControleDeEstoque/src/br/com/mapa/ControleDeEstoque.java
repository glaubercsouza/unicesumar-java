package br.com.mapa;

import java.util.Scanner;

public class ControleDeEstoque {
    
    private Produtos produtosLista[] = new Produtos[100];
    int posicaoAtual = 0;
        
    public static void main(String[] args) {
        
        ControleDeEstoque app = new ControleDeEstoque();

        app.menuPrincipal();
        
    }
    
    // Menus
    
    private void tituloMenu() {
        System.out.println("\n\n========================================");
        System.out.println(" EMPRESA DE IMPORTAÇÃO DE PRODUTOS LTDA");
        System.out.println("========================================");
        System.out.println("     SISTEMA DE CONTROLE DE ESTOQUE");
        System.out.println("========================================");
        
    }
    
    private int opcaoMenuPrincipal() {
        int opcao;
        tituloMenu();
        System.out.println("             MENU PRINCIPAL");
        System.out.println("========================================");
        System.out.println("[1] Cadastro de Produtos\n" + 
                "[2] Movimentação\n" + 
                "[3] Reajuste de Preços\n" + 
                "[4] Relatórios\n" + 
                "[0] Finalizar\n"); 
        System.out.print("Opção: ");
        opcao = getEscolhaMenu();
        return opcao;
    }
    
    public void menuPrincipal() {
        int opcao = 0;
        do {
            opcao = opcaoMenuPrincipal();
            switch(opcao){
                case 1:
                    menuCadastroProdutos();
                    break;
                case 2:
                    menuMovimentacao();
                    break;
                case 3:
                    menuReajuste();
                    break;
                case 4:
                    relatorio();
                    break;
                case 0:
                    System.out.println("========================================");
                    System.out.println("\n        SAINDO DO SISTEMA...\n");
                    System.out.println("========================================");
                    break;
                default:
                    opcaoInvalida();
                    break;
            }
        }while(opcao != 0);  
    }
    
    private void menuCadastroProdutos() {
        int opcao;
        tituloMenu();
        System.out.println("          CADASTRO DE PRODUTOS");
        System.out.println("========================================");
        System.out.println("[1] Inclusão\n" + 
                "[2] Alteração\n" + 
                "[3] Consulta\n" + 
                "[4] Exclusão\n" + 
                "[0] Retornar\n");
        System.out.print("Opção: ");
        opcao = getEscolhaMenu();
        switch (opcao) {
            case 1:
                cadastrarProduto();
                menuCadastroProdutos();
                break;
            case 2:
                alterarProduto();
                menuCadastroProdutos();
                break;
            case 3:
                consultarProduto();
                menuCadastroProdutos();
                break;
            case 4:
                removerProduto();
                menuCadastroProdutos();
                break;
            case 0:
                
                break;
            default:
                opcaoInvalida();
                break;
        }
    }
    
    private void menuMovimentacao() {
        int opcao;
        tituloMenu();
        System.out.println("        MOVIMENTAÇÃO DE PRODUTOS");
        System.out.println("========================================");
        System.out.println("[1] Entrada\n" +
                "[2] Saída\n" +
                "[0] Retornar\n");
        System.out.print("Opção: ");
        opcao = getEscolhaMenu();
        switch (opcao) {
            case 1:
                movimentacaoEntrada();
                menuMovimentacao();
                break;
            case 2:
                movimentacaoSaida();
                menuMovimentacao();
                break;
            case 0:
                break;
            default:
                opcaoInvalida();
                break;
        }
    }
    
    private void menuReajuste(){
        int opcao;
        tituloMenu();
        System.out.println("           REAJUSTE DE PREÇOS");
        System.out.println("========================================");
        System.out.println("[1] Reajustar um produto\n" +
                "[2] Reajustar todos os produtos\n" +
                "[0] Retornar\n");
        System.out.print("Opção: ");
        opcao = getEscolhaMenu();
        switch(opcao){
            case 1:
                reajustar();
                menuReajuste();
                break;
            case 2:
                reajustarTodos();
                menuReajuste();
                break;
            case 0:
                break;
            default:
                opcaoInvalida();
                break;
        }
    }
    
    // Métodos para as opções dos menus
    
    private void cadastrarProduto() {
        String escolha;
        do {
            this.tituloMenu();
            System.out.println("          CADASTRO DE PRODUTO");
            System.out.println("========================================");
            Produtos produtos = setDadosProduto();
            escolha = confirmar();
            if (escolha.equalsIgnoreCase("S")){
                produtosLista[posicaoAtual] = produtos;
                posicaoAtual++;
            }
            escolha = repetir();
        } while (escolha.equalsIgnoreCase("S"));
    }
    
    private void alterarProduto() {
        String escolha;
        do { 
            Scanner scanner = new Scanner(System.in);
            this.tituloMenu();
            System.out.println("             ALTERAR PRODUTO");
            System.out.println("========================================");
            System.out.print("Informe o nome do produto que deseja alterar: ");
            String nomeAlterar = scanner.nextLine();
            boolean controle = true;
            for (int i = 0; i < posicaoAtual; i++) { 
                if (nomeAlterar.equalsIgnoreCase(produtosLista[i].getNome())){
                    controle = false;
                    System.out.println("PRODUTO ENCONTRADO\n");
                    Produtos produtos = setAlterarProduto(i, produtosLista);
                    escolha = confirmar();
                    if (escolha.equalsIgnoreCase("S")){
                        produtosLista[i] = produtos;
                    }
                }
            }
            consultaNaoEncontrada(controle);
            escolha = repetir();
        }while(escolha.equalsIgnoreCase("S"));
    }
    
    private void consultarProduto() {
        String escolha;
        do { 
            Scanner scanner = new Scanner(System.in);
            this.tituloMenu();
            System.out.println("            CONSULTAR PRODUTO");
            System.out.println("========================================");
            System.out.print("Informe o nome do produto que deseja consultar: ");
            String nomeConsultar = scanner.nextLine();
            boolean controle = true;
            for (int i = 0; i < posicaoAtual; i++) { 
                if (nomeConsultar.equalsIgnoreCase(produtosLista[i].getNome())){
                    controle = false;
                    System.out.println(produtosLista[i].toString());
                    break;
                }
            }
            consultaNaoEncontrada(controle);
            escolha = repetir();
        }while(escolha.equalsIgnoreCase("S"));
    }
    
    private void removerProduto() {
        String escolha;
        do {
            Scanner scanner = new Scanner(System.in);
            this.tituloMenu();
            System.out.println("             REMOVER PRODUTO");
            System.out.println("========================================");
            System.out.print("Informe o nome do produto que deseja remover: ");
            String nomeRemover = scanner.nextLine();
            boolean controle = true;
            for (int i = 0; i < posicaoAtual; i++) {
                if (nomeRemover.equalsIgnoreCase(produtosLista[i].getNome())){
                    controle = false;
                    System.out.println(produtosLista[i].toString());
                    escolha = confirmar();
                    if (escolha.equalsIgnoreCase("S")){
                        for(int j = i; j < posicaoAtual - 1; j++){
                            produtosLista[j] = produtosLista[j + 1];
                            posicaoAtual--;
                            System.out.println("\nPRODUTO EXCLUÍDO COM SUCESSO!");
                        }
                    }
                }  
            }
            consultaNaoEncontrada(controle);
            escolha = repetir();
        }while (escolha.equalsIgnoreCase("S"));
    }
    
    private void movimentacaoEntrada() {
        String escolha;
        do {
            Scanner scanner = new Scanner(System.in);
            this.tituloMenu();
            System.out.println("            ENTRADA DE PRODUTO");
            System.out.println("========================================");
            System.out.print("Informe o nome do produto que deseja dar entrada: ");
            String nomeEntrada = scanner.nextLine();
            Produtos produtosMovimentacao;
            boolean controle = true;
            for (int i = 0; i < posicaoAtual; i++) {
                if (nomeEntrada.equalsIgnoreCase(produtosLista[i].getNome())){
                    controle = false;
                    produtosMovimentacao = produtosLista[i];
                    System.out.print("Quantidade Atual: " + produtosMovimentacao.getQuantidadeEstoque() +
                            "\nQuantidade de Entrada: ");
                    int quantidadeEntrada = scanner.nextInt();
                    System.out.println("Quantidade Final: " + (produtosMovimentacao.getQuantidadeEstoque()+ quantidadeEntrada));
                    escolha = confirmar();
                    if (escolha.equalsIgnoreCase("S")){
                        produtosMovimentacao.setAdicionarEstoque(quantidadeEntrada);
                        produtosLista[i] = produtosMovimentacao;
                        System.out.println("\nQUANTIDADE INSERIDA COM SUCESSO!");
                    }
                }
            }
            consultaNaoEncontrada(controle);
            escolha = repetir();
        }while (escolha.equalsIgnoreCase("S"));
    }
    
    private void movimentacaoSaida(){
        String escolha;
        do {
            Scanner scanner = new Scanner(System.in);
            this.tituloMenu();
            System.out.println("             SAÍDA DE PRODUTO");
            System.out.println("========================================");
            System.out.print("Informe o nome do produto que deseja dar saída: ");
            String nomeSaida = scanner.nextLine();
            Produtos produtosMovimentacao;
            boolean controle = true;
            for (int i = 0; i < posicaoAtual; i++) {
                if (nomeSaida.equalsIgnoreCase(produtosLista[i].getNome())){
                    controle = false;
                    produtosMovimentacao = produtosLista[i];
                    System.out.println("Quantidade Atual: " + produtosMovimentacao.getQuantidadeEstoque());
                    System.out.print("Quantidade de Saída: ");
                    int quantidadeSaida;
                    do {
                        quantidadeSaida = scanner.nextInt(); 
                        if(quantidadeSaida <= produtosMovimentacao.getQuantidadeEstoque()){
                        System.out.println("Quantidade Final: " + (produtosMovimentacao.getQuantidadeEstoque()- quantidadeSaida));
                        escolha = confirmar();
                            if (escolha.equalsIgnoreCase("S")){
                            produtosMovimentacao.setRetirarEstoque(quantidadeSaida);
                            produtosLista[i] = produtosMovimentacao;
                            }
                        }else {
                        System.out.println("\nQUANTIDADE INDISPONÍVEL NO ESTOQUE.\n");
                        System.out.println("Insira uma quatidade menor ou igual a " + produtosMovimentacao.getQuantidadeEstoque());
                        }  
                    }while (quantidadeSaida > produtosMovimentacao.getQuantidadeEstoque());
                }
            }
            System.out.println("\nQUANTIDADE RETIRADA COM SUCESSO!");
            consultaNaoEncontrada(controle);
            escolha = repetir();
        }while (escolha.equalsIgnoreCase("S"));
    }
    
    private void reajustar(){
        String escolha;
        do {
            Scanner scanner = new Scanner(System.in);
            this.tituloMenu();
            System.out.println("            REAJUSTE DE PRODUTO");
            System.out.println("========================================");
            System.out.print("Informe o nome do produto que gostaria de inserir o reajuste: ");
            String nomeReajuste = scanner.nextLine();
            Produtos produtosReajuste;
            boolean controle = true;
            for (int i = 0; i < posicaoAtual; i++) {
                if(nomeReajuste.equalsIgnoreCase(produtosLista[i].getNome())){
                    controle = false;
                    produtosReajuste = produtosLista[i];
                    System.out.printf("Preço atual: R$ %.2f %n", produtosReajuste.getPrecoUnitario());
                    System.out.print("Insira o percentual de reajuste ao preço desse produto: ");
                    double reajuste = scanner.nextDouble();
                    double percentualReajuste = (reajuste / 100) + 1;
                    System.out.printf("Preço do produto %s após o reajuste: R$ %.2f. %n", (produtosReajuste.getNome()), (produtosReajuste.getPrecoUnitario() * percentualReajuste));
                    escolha = confirmar();
                    if (escolha.equalsIgnoreCase("S")){
                        produtosReajuste.setReajustarProduto(percentualReajuste);
                        produtosLista[i] = produtosReajuste;
                        System.out.println("\nPRODUTO REAJUSTADO COM SUCESSO!");
                    }
                }
            }
            consultaNaoEncontrada(controle);
            escolha = repetir();
        }while (escolha.equalsIgnoreCase("S"));
    }
    
    private void reajustarTodos() {
        String escolha;
        do {
            Scanner scanner = new Scanner(System.in);
            this.tituloMenu();
            System.out.println("      REAJUSTE DE TODOS OS PRODUTOS");
            System.out.println("========================================");
            System.out.print("Informe o percentual de reajuste que gostaria de inserir nos produtos: ");
            double reajuste = scanner.nextDouble();
            double percentualReajuste = (reajuste / 100) + 1;
            Produtos produtosReajuste;
            for (int i = 0; i < posicaoAtual; i++) {
                produtosReajuste = produtosLista[i];
                produtosReajuste.setReajustarProduto(percentualReajuste);
                produtosLista[i] = produtosReajuste;
                System.out.println("\nTODOS OS PRODUTOS REAJUSTADOS COM SUCESSO!");
            }
            escolha = repetir();
        }while (escolha.equalsIgnoreCase("S"));
    }
    
    private void relatorio() {
        String escolha;
        this.tituloMenu();
        System.out.println("                RELATÓRIO");
        System.out.println("========================================");
        if(posicaoAtual == 0){
            System.out.println("\nNENHUM PRODUTO CADASTRADO!");
        }
        do {
            for(int i = 0; i < posicaoAtual; i++){
                System.out.println(produtosLista[i].toString() + "\n");
            }
            escolha = repetir();
        }while(escolha.equalsIgnoreCase("S"));

    }
    
    // Métodos utilizados com frequência 
    
    private void opcaoInvalida() {
        System.out.println("OPÇÃO INVÁLIDA!\n");
    }
    
    private int getEscolhaMenu(){
        Scanner teclado = new Scanner(System.in);
        return Integer.parseInt(teclado.next());
    }      
        
    private Produtos setDadosProduto() {
        Produtos produtos = new Produtos();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do produto: ");
        String nome = scanner.nextLine();
        produtos.setNome(nome, posicaoAtual, produtosLista);
        
        System.out.print("Informe o preço unitário do produto: R$ ");
        double preco = scanner.nextDouble();
        produtos.setPrecoUnitario(preco);
        
        System.out.print("Informe a unidade de medida: ");
        scanner = new Scanner(System.in);
        String unidade = scanner.nextLine();
        produtos.setUnidadeMedida(unidade);
        
        System.out.print("Informe a quantidade: ");
        int quantidade = scanner.nextInt();
        produtos.setQuantidadeEstoque(quantidade);
        return produtos;
    }
    
    private Produtos setAlterarProduto(int i, Produtos produtosLista[]) {
        Produtos produtosAlterado = new Produtos();
        Scanner scanner = new Scanner(System.in);
        System.out.println("NÃO É POSSÍVEL ALTERAR O NOME DO PRODUTO.\n"
                         + "CASO DESEJE, DEVE-SE EXCLUIR E RECADASTRAR\n"
                + "NOVAMENTE!\n");
        System.out.print("Informe o nome do produto: " + produtosLista[i].getNome() + "\n");
        String nome = produtosLista[i].getNome();
        produtosAlterado.setNomeAlterar(nome);

        System.out.print("Informe o preço unitário do produto: R$ ");
        double preco = scanner.nextDouble();
        produtosAlterado.setPrecoUnitario(preco);
        
        System.out.print("Informe a unidade de medida: ");
        scanner = new Scanner(System.in);
        String unidade = scanner.nextLine();
        produtosAlterado.setUnidadeMedida(unidade);
        
        System.out.print("Informe a quantidade: ");
        int quantidade = scanner.nextInt();
        produtosAlterado.setQuantidadeEstoque(quantidade);
        return produtosAlterado;
    }
     
    private void consultaNaoEncontrada(boolean controle) {
        if (controle) {
            System.out.println("\nPRODUTO NÃO ENCONTRADO!\n");
        }
    }
    
    private String confirmar() {
        Scanner scanner = new Scanner(System.in);
        String escolha;
        System.out.println("\nConfirma a operação [S/N] ?");
        escolha = scanner.next();
        return escolha;
    }
    
    private String repetir() {
        Scanner scanner = new Scanner(System.in);
        String escolha;
        System.out.println("\nGostaria de repetir a operação [S/N] ?");
        escolha = scanner.next();
        return escolha;
    }    
}