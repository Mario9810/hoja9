import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import java.util.Scanner;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ingreso = new Scanner(System.in);
        String source = "";
        ArrayList<String> dictionary;
        dictionary = new ArrayList<String>();
        BSTree<String, String> dicSP;
        String textoTraducido = "";

            System.out.println("ESCOJA EL ARBOL QUE DESEA USAR\n***1. SPLAY TREE\n***2. RED BLACK TREE");
            String opcion = ingreso.nextLine();
            
            Factory factory = new Factory();
            dicSP = factory.getTree(Integer.parseInt(opcion));
            
            System.out.println("ESCOGER DICCIONARIO (PRESIONE ENTER)");
            ingreso.nextLine();

            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new java.io.File("./src"));
            chooser.setDialogTitle("Seleccione su archivo");
            chooser.setFileFilter(new FileNameExtensionFilter("Text files (.txt)", "dic"));
            int returnVal = chooser.showOpenDialog(null);
            if (returnVal == JFileChooser.APPROVE_OPTION) {

                try {
                                                    /*Lee el archivo y obtiene la cadena*/
                    FileInputStream fstream = new FileInputStream(chooser.getSelectedFile().getAbsolutePath());
                    BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

                    String strLine;
                    while ((strLine = br.readLine()) != null) {
                        dictionary.add(strLine); //agregar cada linea al dictionary
                    }

                    /* Separar cadenas y hacer asociacion */
                    for (int i = 0; i < dictionary.size(); i++) {
                        String temp = dictionary.get(i).substring(0, dictionary.get(i).length());
                        String[] partes = temp.split("\\s+");
                        dicSP.put(partes[0],partes[1]);
                    }
                } catch (Exception e) {
                    System.out.println("Archivo no valido!!!");
                }
            }

            /*abrir el texto*/
            System.out.println("FRASE A TRADUCIR (PRESIONE ENTER)");
            ingreso.nextLine();
            JFileChooser chooser2 = new JFileChooser(System.getProperty("java.class.path"));
            chooser2.setDialogTitle("ESCORGER ARCHIVO");
            chooser2.setFileFilter(new FileNameExtensionFilter("Text files (.txt)", "txt"));
            int returnVal2 = chooser2.showOpenDialog(null);
            if(returnVal2 == JFileChooser.APPROVE_OPTION) {
                try {
                    Scanner inputFile2 = new Scanner(new File(chooser2.getSelectedFile().getAbsolutePath()));
                    source = chooser2.getSelectedFile().getAbsolutePath();
                }
                catch (FileNotFoundException e) {
                    System.out.println("NULL");

                }
            }
            
            
            try
            {
                BufferedReader datos = new BufferedReader(new FileReader(source));  // Abre documento 
                String rawText = datos.readLine(); 
                rawText = rawText.substring(0, rawText.length());
                String textoATraducir = rawText.toLowerCase();
                datos.close();  // Se finaliza el lector
                System.out.println("ORIGINAL\n" + textoATraducir);
                String wIngles, wEspanol;
                StringTokenizer st = new StringTokenizer (textoATraducir);


                /* traduce las palabras*/
                while (st.hasMoreTokens())
                {
                    wIngles = st.nextToken();
                    wEspanol = dicSP.get(wIngles);
                    if (wEspanol != null){
                        textoTraducido = (textoTraducido +" "+ wEspanol);
                    }
                    else{
                        textoTraducido = (textoTraducido + " *"+wIngles+"*");
                    }

                }
                System.out.println("   TRADUCCION \n");
                textoTraducido = textoTraducido + ".";
                System.out.println(textoTraducido);
            }
            catch(FileNotFoundException e)
            {
                System.out.println("ERROR");
            }

            dicSP.displayFinal();


        }   
}
