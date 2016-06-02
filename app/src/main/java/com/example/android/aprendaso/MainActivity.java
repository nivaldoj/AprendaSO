package com.example.android.aprendaso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    LinearLayout llHardware;
    LinearLayout llSistemasOperacionais;
    LinearLayout llTarefa;
    LinearLayout llCicloVidaTarefa;
    LinearLayout llArquivo;

    TextView tvCicloTarefaTitulo;
    TextView tvCicloTarefaTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtêm as Views
        llHardware = (LinearLayout) findViewById(R.id.ll_titulo01_conteudo);
        llSistemasOperacionais = (LinearLayout) findViewById(R.id.ll_titulo02_conteudo);
        llTarefa = (LinearLayout) findViewById(R.id.ll_titulo03_conteudo);
        llCicloVidaTarefa = (LinearLayout) findViewById(R.id.ll_titulo04_conteudo);
        llArquivo = (LinearLayout) findViewById(R.id.ll_titulo05_conteudo);

        tvCicloTarefaTitulo = (TextView) findViewById(R.id.tv_ciclotarefa_titulo);
        tvCicloTarefaTexto = (TextView) findViewById(R.id.tv_ciclotarefa_texto);

        // Oculta essas views, fazendo que quando o aplicativo iniciar, já o faça com os títulos ocultos
        llHardware.setVisibility(View.GONE);
        llSistemasOperacionais.setVisibility(View.GONE);
        llTarefa.setVisibility(View.GONE);
        llCicloVidaTarefa.setVisibility(View.GONE);
        llArquivo.setVisibility(View.GONE);

    }

    /**
     * Define o texto na tela do Ciclo de Vida da tarefa: Pronta
     *
     * @param view que chamou o método
     */
    public void setTextCicloVidaPronta(View view) {
        tvCicloTarefaTitulo.setText(R.string.ciclovida_pronta_titulo);
        tvCicloTarefaTexto.setText(R.string.ciclovida_pronta_texto);
    }

    /**
     * Define o texto na tela do Ciclo de Vida da tarefa: Nova
     *
     * @param view que chamou o método
     */
    public void setTextCicloVidaNova(View view) {
        tvCicloTarefaTitulo.setText(R.string.ciclovida_nova_titulo);
        tvCicloTarefaTexto.setText(R.string.ciclovida_nova_texto);
    }

    /**
     * Define o texto na tela do Ciclo de Vida da tarefa: Executando
     *
     * @param view que chamou o método
     */
    public void setTextCicloVidaExecutando(View view) {
        tvCicloTarefaTitulo.setText(R.string.ciclovida_executando_titulo);
        tvCicloTarefaTexto.setText(R.string.ciclovida_executando_texto);
    }

    /**
     * Define o texto na tela do Ciclo de Vida da tarefa: Finalizada
     *
     * @param view que chamou o método
     */
    public void setTextCicloVidaFinalizada(View view) {
        tvCicloTarefaTitulo.setText(R.string.ciclovida_terminada_titulo);
        tvCicloTarefaTexto.setText(R.string.ciclovida_terminada_texto);
    }

    /**
     * Define o texto na tela do Ciclo de Vida da tarefa: Suspensa
     *
     * @param view que chamou o método
     */
    public void setTextCicloVidaSuspensa(View view) {
        tvCicloTarefaTitulo.setText(R.string.ciclovida_suspensa_titulo);
        tvCicloTarefaTexto.setText(R.string.ciclovida_suspensa_texto);
    }

    /**
     * Exibe ou oculta o texto do título "clicado".
     * Também faz a mudança de ícone, se é 'collapse' ou 'expanded'.
     *
     * @param linearLayout que vai ser exibida ou oculta
     * @param imageView que irá ser modificado de acordo com a ação do usuário
     */
    public void handleContent(LinearLayout linearLayout, ImageView imageView) {
        if (linearLayout.isShown()) {
            Fx.slideUp(this, linearLayout);

            linearLayout.setVisibility(View.GONE);

            imageView.setImageResource(R.drawable.cross);

        } else {
            linearLayout.setVisibility(View.VISIBLE);

            Fx.slideDown(this, linearLayout);

            imageView.setImageResource(R.drawable.line);
        }
    }

    /**
     * Handler do onClick do Título 01, de Hardware
     */
    public void toggleContentHardware(View view) {
        ImageView icon = (ImageView) findViewById(R.id.iv_titulo01);

        handleContent(llHardware, icon);
    }

    /**
     * Handler do onClick do Título 02, de Sistemas Operacionais
     */
    public void toggleContentSO(View view) {
        ImageView icon = (ImageView) findViewById(R.id.iv_titulo02);

        handleContent(llSistemasOperacionais, icon);
    }

    /**
     * Handler do onClick do Título 03, do que é uma tarefa
     */
    public void toggleContentTarefa(View view) {
        ImageView icon = (ImageView) findViewById(R.id.iv_titulo03);

        handleContent(llTarefa, icon);
    }

    /**
     * Handler do onClick do Título 04, do ciclo da tarefa
     */
    public void toggleContentCicloTarefa(View view) {
        ImageView icon = (ImageView) findViewById(R.id.iv_titulo04);

        handleContent(llCicloVidaTarefa, icon);
    }

    /**
     * Handler do onClick do Título 05, que fala sobre Arquivos
     */
    public void toggleContentArquivo(View view) {
        ImageView icon = (ImageView) findViewById(R.id.iv_titulo05);

        handleContent(llArquivo, icon);
    }

    /**
     * Exibe na tela a informação (texto) sobre a RAM, quando clicado
     */
    public void setRAMText(View view) {
        TextView titulo = (TextView) findViewById(R.id.tv_hardware_component_title);
        TextView texto = (TextView) findViewById(R.id.tv_hardware_component_text);

        titulo.setText(R.string.hardwareRAMtitle);
        texto.setText(R.string.hardwareRAMtext);
    }

    /**
     * Exibe na tela a informação (texto) sobre a ROM, quando clicado
     */
    public void setROMText(View view) {
        TextView titulo = (TextView) findViewById(R.id.tv_hardware_component_title);
        TextView texto = (TextView) findViewById(R.id.tv_hardware_component_text);

        titulo.setText(R.string.hardwareROMtitle);
        texto.setText(R.string.hardwareROMtext);
    }

    /**
     * Exibe na tela a informação (texto) sobre o Disco Rígido, quando clicado
     */
    public void setHDText(View view) {
        TextView titulo = (TextView) findViewById(R.id.tv_hardware_component_title);
        TextView texto = (TextView) findViewById(R.id.tv_hardware_component_text);

        titulo.setText(R.string.hardwareHDtitle);
        texto.setText(R.string.hardwareHDtext);
    }

    /**
     * Exibe na tela a informação (texto) sobre o Processador, quando clicado
     */
    public void setProcText(View view) {
        TextView titulo = (TextView) findViewById(R.id.tv_hardware_component_title);
        TextView texto = (TextView) findViewById(R.id.tv_hardware_component_text);

        titulo.setText(R.string.hardwareProctitle);
        texto.setText(R.string.hardwareProctext);
    }


}