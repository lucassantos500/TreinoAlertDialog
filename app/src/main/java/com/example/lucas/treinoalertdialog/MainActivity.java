package com.example.lucas.treinoalertdialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoDialogId);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Criando alert Dialog
                dialog = new AlertDialog.Builder(MainActivity.this);
                //Titulo alert Dialog
                dialog.setTitle("Title");
                //Mensagem alert Dialod;
                dialog.setMessage("Mensagem");
                //Impedir que o usuário clique fora do dialog e feche o mesmo
                dialog.setCancelable(false);
                //Colocar icone no titulo
                dialog.setIcon(android.R.drawable.ic_delete);
                //botão não alert Dialog
                dialog.setNegativeButton("Não",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //ação ao clcar em não
                                Toast.makeText(getApplicationContext(),"Você clicou em NÃO!!!",Toast.LENGTH_SHORT).show();
                            }
                        });
                //botão sim alert Dialog
                dialog.setPositiveButton("Sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //ação ao clicar em sim
                                Toast.makeText(getApplicationContext(),"Você clicou em SIM!!!",Toast.LENGTH_SHORT).show();
                            }
                        });
                //criar o dialog e mostrar na tela
                dialog.create();
                dialog.show();
            }
        });

    }
}
