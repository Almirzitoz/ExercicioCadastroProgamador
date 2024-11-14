package projeto;
import javax.swing.*;
public class Tela extends JFrame {
    public Tela(String titulo){
    super(titulo);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 500);
    setLocationRelativeTo(null);
    JPanel painel = new JPanel();
    painel.add(new Titulo());
    painel.add(new Nome());
    painel.add(new Cpf());
    painel.add(new Dia());
    painel.add(new Mes());
    painel.add(new Ano());
    painel.add(new Apresentacao());
    painel.add(new Genero());
    painel.add(new Linguagem());
    painel.add(new NivelConhecimento());
    painel.add(new TabelaVagas());
    painel.add(new VagaEscolhida());
    painel.add(new BotaoEnviar());
    add(painel);

    



    setVisible(true);
 }
}

class Titulo extends JPanel{
public Titulo(){
    titulo();
}
public void titulo(){
    add(new JLabel("Cadastro do Progamador"));
}
public void nome(){
        add(new JLabel("Nome:"));
        add(new JTextField(10));
    }
}

class Nome extends JPanel{
    public Nome(){
        nome();
    }
    public void nome(){
        add(new JLabel("Nome:"));
        add(new JTextField(10));
    }
}
class Cpf extends JPanel{
    public Cpf(){
        cpf();
    }
    public void cpf(){
        add(new JLabel("CPF:"));
        add(new JTextField(10));
    }
}
class Dia extends JPanel{
    public Dia(){
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(1,1,30,1));
        add(new JLabel("Dia:"));
        add(spinner);
    }
}
class Mes extends JPanel{
    public Mes(){
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(1,1,12,1));
        add(new JLabel("Mês:"));
        add(spinner);
    }
}
class Ano extends JPanel{
    public Ano(){
        JSpinner spinner = new JSpinner(new SpinnerNumberModel(2024,1,2024,1));
        add(new JLabel("Ano:"));
        add(spinner);
    }
}
class Apresentacao extends JPanel{
    public Apresentacao(){
        add(new JLabel("Apresentação"));
        add(new JTextArea(10, 10));
    }
}
class Genero extends JPanel{

    public Genero(){
        add(new JLabel("Sexo:"));
       JRadioButton masculino = new JRadioButton("Masculino");
       JRadioButton feminino = new JRadioButton("feminino");
       ButtonGroup genero = new ButtonGroup();
       genero.add(masculino);
       genero.add(feminino);
       add(masculino);
       add(feminino);
    }
}
class Linguagem extends JPanel{
    public Linguagem(){
        String[] opcoes = {"Java","Python","C++","Outras"};
        add(new JLabel("Linguagens:"));
        for (String opcao : opcoes) {
            JCheckBox checkBox = new JCheckBox(opcao);
            add(checkBox);
        }
    }
}
class NivelConhecimento extends JPanel{
    public NivelConhecimento(){
        JSlider slider = new JSlider(0, 3, 0);
        slider.setMajorTickSpacing(1);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        add(new JLabel("Nivel de conhecimento em teste de software: "));
        add(slider);
    }
}
class TabelaVagas extends JPanel{
    public TabelaVagas(){
        String[] vagas = {"Back-end","Front-end"};
        String[][] requisitos = {
            {"Java Spring","React"},
            {"Python Rest API","Vue.js"}
        };
        JTable table = new JTable(requisitos, vagas);
        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
    }
}
class VagaEscolhida extends JPanel{
    public VagaEscolhida(){
        String[] vaga = {"Front-end","Back-end"};
        JComboBox<String> lista = new JComboBox<>(vaga);
        add(lista);
    }
}
class BotaoEnviar extends JPanel{
    public BotaoEnviar(){
        JButton button = new JButton("Enviar");
        add(button);
    }
}