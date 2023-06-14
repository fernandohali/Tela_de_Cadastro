package ControleDeCadastro;

import java.io.IOException;

import javax.swing.JOptionPane;

import InforCadastro.DadosDoAluno;

public class PanelCadastroDoAluno {
    private DadosDoAluno dadosaluno;

    public PanelCadastroDoAluno() {
        this.dadosaluno = new DadosDoAluno();
    }

    public void cadastrarAlunoText(String nomeDoAluno, String idadeDoAluno, String cpf, String MatriculoDoAluno,
            String sexoAluno, String telefoneDoAluno) throws IOException {

        dadosaluno.setNomeDoAluno(nomeDoAluno);
        dadosaluno.setIdadeDoAluno(idadeDoAluno);
        dadosaluno.setCpf(cpf);
        dadosaluno.setMatriculoDoAluno(MatriculoDoAluno);
        dadosaluno.setSexoAluno(sexoAluno);
        dadosaluno.setTelefoneDoAluno(telefoneDoAluno);

        String mensagem = dadosaluno.salvarTxt();

        JOptionPane.showMessageDialog(null, mensagem);

    }

}
