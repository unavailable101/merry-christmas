import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Christmas extends JFrame {

    private JLabel labelName;
    private JLabel intro;
    private JButton decor;
    private JButton recipe;
    private JButton music;
    private JButton secretSanta;
    private JPanel panel2;
    private JLabel footer;
    private String ubos = "<html>" +
            "<center>It's the season of giving, so sir, it's time for you to give us a passing grade</center>" +
            "</html>";
    private String introContent = "<html>" +
            "<center>Here are the options to which event this Christmas season you should like to give a try:</center>" +
            "</html>";
    private String btn1 = "<html>" +
            "<p>Decorating <br> Christmas <br> Tree</p>" +
            "</html>";
    private String btn2 = "<html>" +
            "<p>Christmas <br> Recipes</p>" +
            "</html>";
    private String btn3 = "<html>" +
            "<p>Select a <br> Christmas <br> Music</p>" +
            "</html>";
    private String btn4 = "<html>" +
            "<p>Secret <br> Santa</p>" +
            "</html>";

    public Christmas (String name){
        setContentPane(panel2);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(150, 10, 1000, 700);
        setTitle("Merry Christmas");

        labelName.setText("Hey, " + name + "!");
        footer.setText(ubos);

        intro.setText(introContent);

        decor.setText(btn1);
        recipe.setText(btn2);
        music.setText(btn3);
        secretSanta.setText(btn4);

        //icons for buttons sa usa rani ka button noh ganahan ko mag add ug santa claus haha
        //oo,, usa rani ka button... di pwede mag add og lain pics dire? unsa nang im2?
        //ahh okayy
        //im2 kay ang pag resize sa pic, kng di nako i resize kay dako ra kaau
        ImageIcon decorBtn = new ImageIcon("icons/christmas-tree.png");
        Image im1 = decorBtn.getImage();
        Image im2 = im1.getScaledInstance(decor.getWidth(), decor.getHeight(), Image.SCALE_SMOOTH);
        decor.setIcon(new ImageIcon(im2));

        decor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                DecoratingXmasTree decorate = new DecoratingXmasTree();
                setVisible(false);
            }
        });

        ImageIcon musika = new ImageIcon("icons/musicicon.png");
        Image musicSong = musika.getImage();
        Image musicSong2 = musicSong.getScaledInstance(music.getWidth(), music.getHeight(), Image.SCALE_SMOOTH);
        music.setIcon(new ImageIcon(musicSong2));
        music.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SelectMusic sm = new SelectMusic();
                setVisible(false);
            }
        });
        ImageIcon recipeBtn = new ImageIcon("icons/christmasrecipe.png");
        Image recipeFood = recipeBtn.getImage();
        Image recipeFood2 = recipeFood.getScaledInstance(recipe.getWidth(), recipe.getHeight(), Image.SCALE_SMOOTH);
        recipe.setIcon(new ImageIcon(recipeFood2));
        recipe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ChristmasRecipe cr = new ChristmasRecipe();
                setVisible(false);
            }
        });

        ImageIcon santaBtn = new ImageIcon("icons/santaclaus.png");
        Image santa1 = santaBtn.getImage();
        Image santa2 = santa1.getScaledInstance(secretSanta.getWidth(), secretSanta.getHeight(), Image.SCALE_SMOOTH);
        secretSanta.setIcon(new ImageIcon(santa2));

        secretSanta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SecretSanta ss = new SecretSanta(name);
                setVisible(false);
            }
        });
    }
}
