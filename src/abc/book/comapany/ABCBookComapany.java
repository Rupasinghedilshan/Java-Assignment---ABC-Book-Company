package abc.book.comapany;

public class ABCBookComapany {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen1().setVisible(true);
            }
        });
    }
    
}
