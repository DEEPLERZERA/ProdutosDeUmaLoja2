//ProdutosdeUmaLoja.java

import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*; //Importando bibliotecas

class ProdutosdeUmaLoja  extends JFrame implements ActionListener  //Criando classe do programa
{
	    JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12;   //Criando botão
	    JTextField T1,T2; //Criando textfield


   public static void main(String args[]) throws IOException  //Inicializando método main
   {



      JFrame JProdutosdeUmaLoja = new ProdutosdeUmaLoja();
      JProdutosdeUmaLoja.setVisible(true);  //Setando janela como true

        }

        ProdutosdeUmaLoja() {  //Criando método construtor

			setTitle("ProdutosdeUmaLoja");  //Colocando titulo da janela
			setSize(1280,720);   //Tamanho da janela
			setLocation(50,50);  //Localização na da janela na tela
			B1 = new JButton("CafecomLeite");           //Criando botões
			B1.addActionListener(this);
			B1.setFont(new Font("",Font.BOLD,18));   //p
			B2 = new JButton("CookieRecheado");
			B2.addActionListener(this);
			B2.setFont(new Font("",Font.BOLD,18));
			B3 = new JButton("PaocomMortandela");
			B3.addActionListener(this);
			B3.setFont(new Font("",Font.BOLD,18));
			B4 = new JButton("Chá");
			B4.addActionListener(this);
			B4.setFont(new Font("",Font.BOLD,18));
			B5 = new JButton("AddCafeEmPo");
			B5.addActionListener(this);
			B5.setFont(new Font("",Font.BOLD,18));
			B6 = new JButton("AddCookie");
			B6.addActionListener(this);
			B6.setFont(new Font("",Font.BOLD,18));
			B7 = new JButton("AddLeite");
			B7.addActionListener(this);
			B7.setFont(new Font("",Font.BOLD,18));
			B8 = new JButton("AddPao");
			B8.addActionListener(this);
			B8.setFont(new Font("",Font.BOLD,18));
			B9 = new JButton("AddChá");
			B9.addActionListener(this);
			B9.setFont(new Font("",Font.BOLD,18));
			B10 = new JButton("AddFrios");
			B10.addActionListener(this);
			B10.setFont(new Font("",Font.BOLD,18));
			B11 = new JButton("AddChocolate");
			B11.addActionListener(this);
			B11.setFont(new Font("",Font.BOLD,18));
			B12 = new JButton("Limpar");
			B12.addActionListener(this);
			B12.setFont(new Font("",Font.BOLD,18));
			T1 = new JTextField();   //Criando TextField
			T1.setEditable(false);
			T2 = new JTextField();


			getContentPane().setBackground(Color.cyan);     //Colocando backgroud como cyan
			getContentPane().setLayout(new GridLayout(4,6));   //Definindo proporção da tela
		    getContentPane().add(B1);getContentPane().add(T1);getContentPane().add(B5);getContentPane().add(T2);   //Definindo design geral do programa
		    getContentPane().add(B2);getContentPane().add(B6);
		    getContentPane().add(B3);getContentPane().add(B7);
		    getContentPane().add(B4);getContentPane().add(B8);
		                             getContentPane().add(B9);
			                         getContentPane().add(B10);
			                         getContentPane().add(B11);
			                         getContentPane().add(B12);
		}

		public void actionPerformed(ActionEvent e) {
			String[] IngredienteNome = { "CafeEmPo", "Cookie", "Leite", "Pao", "cha", "frios", "Chocolate"};           //Criação de Arrays para armazenar todos os dados no banco
			      String[] IngredienteUnidadedeMedida = {"ML", "G", "L", "G", "ML", "G"};
			      String[] IngredientePrecoUnidade = {"5Reais", "3Reais", "5Reais", "1Reais", "2.50Reais", "3Reais"};
			      String[] ProdutoNome = {"CafecomLeite", "CookieRecheado", "PaocomMortandela", "Cha"};
			      String[] ProdutoPreco = {"4Reais", "6Reais", "5Reais", "3Reais"};
			      String[] ProdutoIngredientes = {"CafeeLeite", "CookieChocolate","PaoeFrios","Cha"};

			     int A = 0;
      int[] IngredienteQuantidade = {5,8,2,15,2,27,52};

			  if(e.getSource() == B1) {

				    if(IngredienteQuantidade[0] >= 5 && IngredienteQuantidade[2] >= 2) {     //verificando se temos a quantidade de ingredientes disponíveis
				   				     T1.setText("\nVoce pode comprar CafeComLeite");



				   				}
				   				else {   //Em caso não tenha a quantidade exata mostra isso para o usuário
				   					 T1.setText("Voce nao pode comprar CafeComLeite");

				}

			  }
			 if(e.getSource() == B2) {

				  if(IngredienteQuantidade[1] >= 10 && IngredienteQuantidade[6] >= 30) {
					                T1.setText("");
				 					T1.setText("Voce pode comprar CookieRecheado!");
				 					return;

				 				}
				 				else {
									T1.setText("");
				 					T1.setText("Voce nao pode comprar CookieRecheado!");

				}


			 }

		   if(e.getSource() == B3) {

			     if(IngredienteQuantidade[3] >= 10 && IngredienteQuantidade[5] >= 15) {
					             T1.setText("");
			   				     T1.setText("Voce pode comprar PaocomMortandela!");

			   			   }
			   			   else {
							      T1.setText("");
			   				      T1.setText("Voce nao pode comprar PaocomMortandela!");

			   }


		   }

		 if(e.getSource() == B4) {

			   if(IngredienteQuantidade[4] >= 1) {
				                T1.setText("");
			                    T1.setText("Voce pode comprar cha!");


			 			   }
			 			   else {
			 				   T1.setText("Voce nao pode comprar cha!");

			   }

		 }

		if(e.getSource() == B5) {
			A = Integer.parseInt(T2.getText());

			IngredienteQuantidade[0] =  IngredienteQuantidade[0] + A;    //Faz a somatória do número da Array antiga com o atual
			T2.setText("");
            T2.setText("Agora voce tem de CafeEmPo: " + IngredienteQuantidade[0]);


		}

		if(e.getSource() == B6)  {

			A = Integer.parseInt(T2.getText());

			IngredienteQuantidade[1] =  IngredienteQuantidade[1] + A;    //Faz a somatória do número da Array antiga com o atual
			T2.setText("");
            T2.setText("Agora voce tem de Cookie: " + IngredienteQuantidade[1]);


		}

		if(e.getSource() == B7)  {

					A = Integer.parseInt(T2.getText());

					IngredienteQuantidade[2] =  IngredienteQuantidade[2] + A;    //Faz a somatória do número da Array antiga com o atual
					T2.setText("");
		            T2.setText("Agora voce tem de Leite: " + IngredienteQuantidade[2]);



		}

		if(e.getSource() == B8)  {

							A = Integer.parseInt(T2.getText());

							IngredienteQuantidade[3] =  IngredienteQuantidade[3] + A;    //Faz a somatória do número da Array antiga com o atual
							T2.setText("");
				            T2.setText("Agora voce tem de Pao: " + IngredienteQuantidade[3]);



		}

		if(e.getSource() == B9)  {

							A = Integer.parseInt(T2.getText());

							IngredienteQuantidade[4] =  IngredienteQuantidade[4] + A;    //Faz a somatória do número da Array antiga com o atual
							T2.setText("");
				            T2.setText("Agora voce tem de Chá: " + IngredienteQuantidade[4]);



		}

		if(e.getSource() == B10)  {

							A = Integer.parseInt(T2.getText());

							IngredienteQuantidade[5] =  IngredienteQuantidade[5] + A;    //Faz a somatória do número da Array antiga com o atual
							T2.setText("");
				            T2.setText("Agora voce tem de Frios: " + IngredienteQuantidade[5]);



		}

		if(e.getSource() == B11)  {

							A = Integer.parseInt(T2.getText());

							IngredienteQuantidade[6] =  IngredienteQuantidade[6] + A;    //Faz a somatória do número da Array antiga com o atual
							T2.setText("");
				            T2.setText("Agora voce tem de Chocolate: " + IngredienteQuantidade[6]);



		}

       if(e.getSource() == B12)  {   //Se botão escolhido for limpar

	   					T1.setText("");   //Limpar textfield 1
	   					T2.setText("");  //Limpar textfield 2



		}


	         }

		 }













