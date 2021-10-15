/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package print;

/**
 *
 * @author Muhammad Fahmy
 */
public class Print {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
      private class btnMakanan implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            c_makanan a = new c_makanan(new v_MENUPAKAN());
            view.dispose();
        }
    }

    private class btnKandang implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_kandang a = new c_kandang(new v_KANDANG(), new m_kandang());
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class btnValidasi implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_validasi a = new c_validasi(new v_VALIDASI(), new m_validasi());
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private class btnLogout implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                c_user a = new c_user(new v_LOGIN(), new m_user());
                view.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(c_admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
