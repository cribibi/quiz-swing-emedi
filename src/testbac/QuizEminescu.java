package testbac;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizEminescu implements ActionListener {

    String[] questions = {" Care este numele original a lui Mihai Eminescu?",
            " In ce an s-a nascut Mihai Eminescu?",
            " Care este poezia de debut a poetului?",
            " In ce an a avut loc acest debut?",
            " Ce genuri literare abordeaza poetul?",
            " In ce societate literara a facut parte Mihai Eminescu?",
            " Ce alte opere a mai scris autorul?",
            " Din ce categorie a scriitorilor face parte Mihai Eminescu?",
            " Al carui curent literar este reprezentant Eminescu?",
            " Carui curent literar se Impotrivea romantismul?",
            " Romantismul se caracterizeaza prin:",
            " Ultimul mare romantic a fost:",
            " Poemul Floare albastra de Mihai Eminescu a fost publicat In anul 1873 In revista …",
            " Din ce etapa de creație eminesciana face parte poemul?",
            " La romantici, tema iubirii apare In corelație cu …",
            " Eminescu preia motivul florii albastre, din literatura Europeana, de la…",
            " Simbolul florii albastre este regasit si In alte texte eminesciene precum:",
            " In lirica eminesciana, albastrul este culoarea …",
            " Iar floarea albastra simbolizeaza…",
            " Poemul Floare albastra depaseste cadrul unei idile, deoarece implic",
            " In cate voci este organizat discursul liric?",
            " Ce fel de scena imagineaza vocea feminina?",
            " Pe lânga speciile idila si egloga, poemul este si:",
            " Prin ce alta antiteza se mai poate evidenția diferența dintre cei doi?",
            " In prima secvența In care se identifica vocea eului, cum este lirismul?",
            " Ce conoteaza marea In poem?",
            " Care sunt cele doua teme ale poemului?",
            " Ce forma Imbraca adverbul iar, din din incipit?",
            " Discursul fetei din prima secvența este o interogație retorica, dar si o enumeratie marcata de repetarea lui…",
            " Expresia cufundare Il surprinde pe eul liric Intr-o ipostaza…",
            " Ce Ințeles are sintagma râuri In soare?",
            " Ce semnificație are sintagma piramidele-nvechite ?",
            " Prin imperativul nu cata, fata Incearca:",
            " Prin reprosul primei secvențe, fata Ii dezvaluie eului:",
            " In ansamblu, prima secvența Infațiseaza",
            " A doua secventa reprezinta o meditație a eului liric asupra faptului ca…",
            " A treia secvența reia vocea fetei, si reprezinta …",
            " Chemarea are loc In cadrul naturii, Intrucât …",
            " Cromatica parului de aur al fetei sugereaza …",
            " Spre deosebire de alte opere, aici aparitia feminina realizeaza …",
            " A patra secvența poetica reprezinta vocea eului poetic care …",
            " Ce sugereaza versul final?",

    };


    String[][] options = {{"Ion Popescu","Mihail Eminovici","Gheorghe Alecu","Pavel Ciprian"},
            {"1820","1919","1850","1929"},
            {"De-as avea","La mormântul lui Aron Pumnul","Craiasa din povesti","Somnoroase pasarele"},
            {"epic","liric","dramatic","hibrid"},
            {"Sburatorul","Cenaclul de luni","Literatorul","Junimea"},
            {"Geniu pustiu","Sarmanul Dionis","Fat-Frumos din lacrima","Rondelul lunii"},
            {"categoria marilor simbolisti","categoria marilor clasici","categoria dadaistilor","categoria suprarealistilor"},
            {"clasicismului","simbolismului","romantismului","naturalismului"},
            {"suprarealismului","impresionismului","clasicismului","modernismului"},
            {"sensibilitate","individualitatea creatoare","afirmarea originalitații","idealul, ca tema centrala"},
            {"Ion Heliade-Radulescu","Mihai Eminescu","Vasile Alecsandri","Costache Negruzzi"},
            {"Dacia literara","Albina româneasca","Convorbiri literare","România literara"},
            {"prima etapa","a doua etapa","a treia etapa","din niciuna"},
            {"tema familiei","tema paternitații","tema naturii","tema jocului"},
            {"Hegel","Novalis","Schopenhauer","Leopardi"},
            {"Calin(file din poveste);","Lacul;","Sarmanul Dionis;","Lacustra;"},
            {"pacii","infinitului","idealului","a marilor departari"},
            {"generozitatea","viața","misterul","frumusețea"},
            {"tema naturii","condiția geniului","spațiul rural","cadrul rustic"},
            {"Doua ( masculina si feminin","Una","Patru","Cinci"},
            {"Erotica","Istorica","Eroica","Revoluționara"},
            {"O meditație pe tema geniului","O fabula","Un basm","O nuvela"},
            {"Cosmic-terestru","Subacvatic-terestru","Viu-mort","Frumos-urât"},
            {"Subiectiv","Obiectiv","Ambele tipuri","Niciunul"},
            {"Lumea subacvatica","Misterul","Geneza","Pasiunea"},
            {"Iubirea","Familia","Natura","Geniul"},
            {"Unui repros","Unei rugi","Unui strigat","Unui alint"},
            {"Iar","Si","Sau","Virgula"},
            {"Intima","Meditativa","Familiara","Necunoscuta"},
            {"Relația Intre cei doi","Mai multe râuri","Un tablou de vara","Aspirație spre cunoastere"},
            {"Aspirație","Izvor istoric","Asocierea perfecțiunii","Tradiție egipteana"},
            {"Sa-l aduca pe eu In lumea ei","Sa Ii dea iubitului un ordin","Sa-l determine pe eu sa fie optimist","Sa Incheie relația cu iubitul"},
            {"Un secret","Adevarul despre sensul existenței","Adevarul despre identitatea ei","O minciuna"},
            {"Imaginea naturii","Lumea eului liric","Satul","Valea"},
            {"Fata este frumoasa","El este indragostit","Fericirea sta-n trairea iubirii","Natura este In rezonanța cu iubirea"},
            {"reprosul ei","chemarea In lumea ei","plimbarea celor doi","desparțirea"},
            {"reprezinta un cadru familiar","reprezinta un cadru protector","reprezinta un cadru strain","reprezinta un cadru retras"},
            {"o apariție de basm","o lume fantastica","perfecțiunea fetei","pasiunea"},
            {"desparțirea","chemarea la iubire","atmosfera","reprosul"},
            {"rememoreaza iubirea","continua meditație","descrie natura","reda frumusețea fetei"},
            {"contrastul vis-realitate","iubirea dintre cei doi","regretul eului poetic","tabloul naturii"},};

    char[] answers = {'A', 'A', 'A','A', 'A', 'A','A', 'A', 'A','A', 'A', 'A','A', 'A', 'A','A', 'A', 'A','A', 'A', 'A',
            'A', 'A', 'A','A', 'A', 'A','A', 'A', 'A','A', 'A', 'A','A', 'A', 'A','A', 'A', 'A','A', 'A', 'A'};

    String[] feedback = {" Numele real al lui Eminescu a fost Mihail Eminovici. Numele de Eminescu este primit de la Iosif Vulcan, cel care Ii publica o serie de poezii.",
            " Mihai Eminescu s-a nascut la 15 ianuarie 1850, In Botosani, copilaria petrecând-o In satul Ipotesti.",
            " Desi Eminescu publica inițial poezia La mormantul lui Aron Pumnul, se considera ca poezia de debut a poetului a fost De-as avea, In revista Familia.",
            " Debutul a avut loc pe data de 25 februarie 1866, cu ajutorul directorul revistei Familia, Iosif Vulcan",
            " Mihai Eminescu a abordat toate cele trei genurile literare. Dar, notorietatea sa se centreaza In jurul poeziei. Iubitor de creație literara, el ofera literaturii române si o serie de nuvele centrate pe diferite teme. El nu a fost strain nici de genul dramatic, pe care l-a folosit In creațiile lui lirice.",
            " In cea de a doua jumatate a secolului XIX are loc o transformare marcanta In constiința literaturii române. Eruditul Titu Maiorescu, cel care cuantifica critica literara, este promotorul cenaclului Junimea. Eminescu este sprijinit de acest cenaclu, pe care Il frecventeaza cu devotament.",
            " Eminescu a fost autorul a numeroase poezii de inspirație romantica clasica sau filosofica, dar acesta s-a remarcat si In proza cu nuvele precum Sarmanul Dionis sau Cezara, dar si In basme precum Fat-Frumos din lacrima",
            " Alaturi de Creanga, Caragiale si Slavici, Eminescu face parte din categoria marilor clasici romani.",
            " Mihai Eminescu a fost un poet romantic, Intreaga lui opera caracterizându-se prin libertatea de exprimare.",
            " Romantismul apare ca o reacție Impotriva clasicismului, dezvoltând o libertate de exprimare asupra emoțiilor, trairilor si fanteziei.",
            " Romantismul se caracterizeaza prin sensibilitate, individualitatea creatoare, individualitatea creatoare, afirmarea originalitatii, idealul, ca tema centrala, dar si prin dorința de libertate si respingerea convențiilor impuse de clasicism.",
            " Eminescu trebuie Incadrat In romantismul european si comparat cu toți marii romantici europeni, cu Byron si Shelley, cu Holderlin si Novalis, cu Leopardi si Victor Hugo, cu Puskin si Lermontov. Eminescu a fost romantic european In ordine cronologica, dupa Victor Hugo. considerat de critica straina si româneasca ultimul mare",
            " Din 1870 numele lui Mihai Eminescu devine din ce In ce mai comun In paginile revistei societații Junimea, Convorbiri literare.",
            " A doua etapa de creație, identificata Intre anii 1870-1876, supranumita si perioada romantismului Inalt, se caracterizeaza prin creații ample precum Calin(file din poveste) sau Fat-frumos din tei. Temele abordate, precum iubirea si natura, sunt specific romantice. Se observa un romantism tumultuos, patetic, cu multe epitete folosite, structura antitetica a poeziilor, folosirea exclamațiilor retorice etc.",
            " Iubirea si natura sunt pentru Eminescu formele fundamentale de manifestare a personalitaţii sale de excepţie. Natura este un cadru fizic pentru toate gesturile poetului, de la atitudinea meditativ filosofica, la cea albastra, Lasa-ți lumea ..., etc.) cadrul fizic este al unei naturi Incântatoare, de basm. dragostea apare ca un vis frumos de fericire ( In poezii precum Dorința, Lacul, Floare una terestra, cealalta cosmica, aflate de cele mai multe ori In interferenţa .Acolo unde erotica. Infaţisarea ei se constituie pe doua dimensiuni esenţiale :",
            " Floare albastra simbolizeaza idealul de iubire, de fericire pura. Motivul florii albastre simbolizeaza In romanul lui Novalis, Heinrich von Ofterdingen, tendința spre infinit, iar In lirica lui Leopardi, voința de „a rataci” la infinit.",
            " Simbolul florii albastre, regasit si In alte texte eminesciene precum Calin(file din poveste) si Sarmanul Dionis , dobândeste valoare polisemantica: aspirația spre fericire prin iubire, chemare a lumii fenomenale, motiv poetic european Intr-o viziune lirica proprie; nostalgie a iubirii ca mister al vieții. Eminescu dezvolta acest",
            " La Eminescu, albastrul este cea mai rece dintre culori. Intalnita In majoritatea creațiilor sale, albastrul este simbolul infinitului, al eternitaţii. Luna si stelele, cerul, apele si florile albastre sunt lumina si infinitul ce Isi dau mâna In creaţiile eminesciene. („Pe un deal rasare luna, ca o vatra de jaratic, / [...] /Flori albastre are-n paru-i si o stea In frunte poarta” , „Lacul codrilor albastru / Nuferi galbeni Il Incarca”).",
            " Spre deosebire de Novalis si Leopardi, Eminescu atribuie simbolului conotaţii noi, atribuid simbolul idealului feminin, care reprezinta, In lirica sa, atat viata, cât si misterul sau frumusețea.",
            " Idila este o specie de poezie lirica si erotica din sfera poeziei bucolice, In care sunt prezentate, In forma optimista sau idealista viața si dragostea, In cadrul rustic. Poemul aduce In plus tema condiției de geniu, ceea ce transforma poemul din punct de vedere al complexitații, conferindu-i si un caracter eclectic;",
            " Se identifica mai multe voci lirice- cea a eului liric si cea a fetei, acestea alternand de-a lungul poeziei. Lirismul subiectiv alterneaza cu lirismul mastilor, vocea fetei exprimând o masca a poetului.",
            " Scena chemarii la iubire in planul terestru reprezinta o secventa erotica in cadrul protector al naturii.",
            " Una dintre trasaturile esențiale ale poemului este caracterul eclectic, impletirea mai multor specii. Astfel, poemul este o idila prin secvența chemarii In natura, este o elegie- meditație asupra iubirii, o egloga, dar si o meditație romantica pe tema geniului In relație cu iubirea, prin discursul fetei din prima secvența, In care este configurata lumea eului liric.",
            " La nivel general, se observa o diferența esențiala Intre cei doi. Ființa iubita Infațiseaza tipul omului comun, terestru, In timp ce eul liric aspira spre cunoasterea absoluta, cu trasaturi ale omului de geniu. Aceste trasaturi sunt identificate prin simboluri cosmice, in discursul fetei.",
            " Poetul se foloseste de „lirismul mastilor” pentru a juca rolul masculin si rolul feminin cu aceeasi intensitate. Tocmai de aceea, exprimarea variaza de la persoana I la persoana a II-a. Se identifica marci ale subiectivitații precum Eu sau -am spus.",
            " In lirica eminesciana, marea este un element cheie, simbolizând geneza, precum In poemul Luceafarul, dar confera poemului si o atmosfera de mister.",
            " In lirica eminesciana, natura si dragostea sunt teme permanente, aflate In consonanţa, deoarece natura este pentru acesta o stare de spirit, iar Infaţisarea ei este relaţionata cu sentimentul.",
            " Prima secvența a poemului debuteaza cu adverbul iar, care Imbraca forma unui repros din partea fetei, adresat eului liric, care Infațiseaza ipostaza omului de geniu de tip aspirational.",
            " In discursul ei, fata reproseaza aspirațiile iubitului, enumerand o serie de simboluri semnificative pentru idealurile eului.",
            " Prin cuvântul cufundare, fata exprima starea meditativa a eului liric.",
            " Vocea fetei foloseste ( In reprosul adresat iubitului, pentru exprimarea aspirațiilor sale superioare) diverse simboluri, precum râuri In soare, care reprezinta dorința de cunoastere absoluta.",
            " Vocea fetei foloseste, In reprosul adresat iubitului, pentru exprimarea aspiratiilor sale superioare diverse simboluri precum piramidele-nvechite, care exprima atat dorinta de cunostere absoluta, cât si perfecțiunea sugerata de construcțiile simetrice egiptene.",
            " In poem, sintagma nu cata Imbraca forma unui avertisment In care fata Incearca sa transmita faptul ca Implinirea se realizeaza prin iubire, In lumea ei. Astfel, fata Incearca sa Il aduca In lume ei pe Indragostit.",
            " Prima secventa poetica are rolul de a exprima adevarul despre sensul existenței, adica Implinirea realizata prin iubire, In lumea fetei.",
            " Discursul fetei, atât prin repros, cât si prin avertisment si simboluri, ilustreaza lumea eului liric, In toata complexitatea ei.",
            " Secvența reprezinta meditația eului poetic asupra sensului iubirii rememorate. Prin -Ah! Ea spuse adevarul, eul liric aproba avertismentul fetei din prima secvența, si admite faptul ca fericirea se realizeaza prin iubire, In spațiul natural.",
            " A treia secvența prezinta chemarea eului In cadrul natural, In lumea fetei, pentru a trai iubirea. Se distinge aspirația spre refacerea cuplului originar. Secvența chemarii la iubire, In plan terestru, In lumea fetei, se realizeaza prin versul Hai In codrul cu verdeața.",
            " Natura reprezinta un spațiu protector, un paradis terestru pentru refacerea cuplului.",
            " In poeziile eminesciene, parul blond sugereaza aparițiile de basm, puritatea si perfecțiunea. Distincția se intalneste si In poemul Luceafarul, unde parul blond sugereaza apariția angelica, iar cel brunet apariția demonica",
            " In majoritatea operelor cu tema asemanatoare, chemarea la iubire este realizata de catre eul liric, care aspira ca ființa iubita sa vina In lumea lui.",
            " A doua intervenție a vocii eului poetic continua meditația din cea de-a doua secvența poetica asupra iubirii trecute, rememorate, pe care indragostitul o proiecteaza ca fiind ideala.",
            " Contrastul dintre vis si realitate, ca incompatibilitate a celor doua lumi, este sugerat de versul final Totusi este trist In lume!"};
    char guess;
    char answer;
    char index;
    int correct_guesses = 0;
    int total_question = questions.length;
    int result;
    int seconds = 15;
    JFrame frame = new JFrame();
    JTextField questionNrField = new JTextField();
    JTextArea questionsArea = new JTextArea();
    JTextArea essayArea = new JTextArea();
    //JScrollPane scrollPane = new JScrollPane(essayArea);
    //JScrollBar scrollBar =new JScrollBar();
    JTextArea feedbackArea = new JTextArea();
    JButton buttonA = new JButton();
    JButton buttonB = new JButton();
    JButton buttonC = new JButton();
    JButton buttonD = new JButton();
    JButton essayButton = new JButton();
    JLabel answer_labelA = new JLabel();
    JLabel answer_labelB = new JLabel();
    JLabel answer_labelC = new JLabel();
    JLabel answer_labelD = new JLabel();
    JLabel time_label = new JLabel();
    JLabel seconds_left = new JLabel();
    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();

    Timer timer = new Timer(2000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            seconds--;
            seconds_left.setText(String.valueOf(seconds));
            if (seconds <= 0) {
                displayAnswer();
            }
        }
    });

    public QuizEminescu() {


        questionNrField.setBounds(0, 10, 1200, 30);
        questionNrField.setBackground(new Color(255, 255, 255));
        questionNrField.setForeground(new Color(0, 0, 0));
        questionNrField.setFont(new Font("Ink free", Font.BOLD, 30));
        //questionNrField.setBorder(BorderFactory.createBevelBorder(1));
        questionNrField.setHorizontalAlignment(JTextField.CENTER);
        questionNrField.setEditable(false);

        questionsArea.setBounds(0, 100, 1200, 100);
        questionsArea.setLineWrap(true);
        questionsArea.setWrapStyleWord(true);
        questionsArea.setBackground(new Color(255, 255, 255));
        questionsArea.setForeground(new Color(0, 0, 0));
        questionsArea.setFont(new Font("MV Boli", Font.BOLD, 20));
        questionsArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        questionsArea.setBorder(BorderFactory.createBevelBorder(1));
        questionsArea.setEditable(false);

        essayArea.setBounds(0, 100, 1200, 750);
        essayArea.setLineWrap(true);
        essayArea.setWrapStyleWord(true);
        essayArea.setBackground(new Color(255, 255, 255));
        essayArea.setForeground(new Color(0, 0, 0));
        essayArea.setFont(new Font("MV Boli", Font.PLAIN, 10));
        essayArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        essayArea.setBorder(BorderFactory.createBevelBorder(1));
        essayArea.setEditable(false);
        essayArea.setVisible(false);
        essayArea.setText(
                "What is Lorem Ipsum?\n" +
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.\n" +
                "\n" +
                "Why do we use it?\n" +
                "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).\n" +
                "\n" +
                "\n" +
                "Where does it come from?\n" +
                "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\n" +
                "\n" +
                "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham." +
                "The standard Lorem Ipsum passage, used since the 1500s\n" +
                "\"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\"\n" +
                "\n" +
                "Section 1.10.32 of \"de Finibus Bonorum et Malorum\", written by Cicero in 45 BC\n" +
                "\"Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?\"\n" +
                "\n" +
                "1914 translation by H. Rackham\n" +
                "\"But I must explain to you how all this mistaken idea of denouncing pleasure and praising pain was born and I will give you a complete account of the system, and expound the actual teachings of the great explorer of the truth, the master-builder of human happiness. No one rejects, dislikes, or avoids pleasure itself, because it is pleasure, but because those who do not know how to pursue pleasure rationally encounter consequences that are extremely painful. Nor again is there anyone who loves or pursues or desires to obtain pain of itself, because it is pain, but because occasionally circumstances occur in which toil and pain can procure him some great pleasure. To take a trivial example, which of us ever undertakes laborious physical exercise, except to obtain some advantage from it? But who has any right to find fault with a man who chooses to enjoy a pleasure that has no annoying consequences, or one who avoids a pain that produces no resultant pleasure?\"\n" +
                "\n" +
                "Section 1.10.33 of \"de Finibus Bonorum et Malorum\", written by Cicero in 45 BC\n" +
                "\"At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi sint occaecati cupiditate non provident, similique sunt in culpa qui officia deserunt mollitia animi, id est laborum et dolorum fuga. Et harum quidem rerum facilis est et expedita distinctio. Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est, omnis dolor repellendus. Temporibus autem quibusdam et aut officiis debitis aut rerum necessitatibus saepe eveniet ut et voluptates repudiandae sint et molestiae non recusandae. Itaque earum rerum hic tenetur a sapiente delectus, ut aut reiciendis voluptatibus maiores alias consequatur aut perferendis doloribus asperiores repellat.\"\n" +
                "\n" +
                "1914 translation by H. Rackham\n" +
                "\"On the other hand, we denounce with righteous indignation and dislike men who are so beguiled and demoralized by the charms of pleasure of the moment, so blinded by desire, that they cannot foresee the pain and trouble that are bound to ensue; and equal blame belongs to those who fail in their duty through weakness of will, which is the same as saying through shrinking from toil and pain. These cases are perfectly simple and easy to distinguish. In a free hour, when our power of choice is untrammelled and when nothing prevents our being able to do what we like best, every pleasure is to be welcomed and every pain avoided. But in certain circumstances and owing to the claims of duty or the obligations of business it will frequently occur that pleasures have to be repudiated and annoyances accepted. The wise man therefore always holds in these matters to this principle of selection: he rejects pleasures to secure other greater pleasures, or else he endures pains to avoid worse pains.\"");

        feedbackArea.setBounds(0, 500, 1200, 250);
        feedbackArea.setLineWrap(true);
        feedbackArea.setWrapStyleWord(true);
        feedbackArea.setBackground(new Color(255, 255, 255));
        feedbackArea.setForeground(new Color(0, 0, 0));
        feedbackArea.setFont(new Font("MV Boli", Font.ITALIC, 20));
        feedbackArea.setAlignmentX(Component.CENTER_ALIGNMENT);
        feedbackArea.setAlignmentY(Component.CENTER_ALIGNMENT);
        feedbackArea.setBorder(BorderFactory.createBevelBorder(1));
        feedbackArea.setEditable(false);

        buttonA.setBounds(20, 250, 75, 50);
        buttonA.setBackground(Color.RED);
        buttonA.setOpaque(true);

//        buttonA.setFont(new Font("MV Boli", Font.BOLD, 20));
//        buttonA.setContentAreaFilled(true);
//
//        buttonA.setForeground(new Color(25, 25, 25));
//        buttonA.setFocusable(false);
        buttonA.addActionListener(this);
        buttonA.setText("A");

        answer_labelA.setBounds(110, 250, 300, 50);
        answer_labelA.setBackground(new Color(224, 224, 224));
        answer_labelA.setForeground(new Color(0, 0, 0));
        answer_labelA.setFont(new Font("MV Boli", Font.PLAIN, 20));

        buttonB.setBounds(20, 300, 75, 50);
        buttonB.setFont(new Font("MV Boli", Font.BOLD, 20));
        buttonB.setFocusable(false);
        buttonB.addActionListener(this);
        buttonB.setText("B");

        answer_labelB.setBounds(110, 300, 300, 50);
        answer_labelB.setBackground(new Color(224, 224, 224));
        answer_labelB.setForeground(new Color(0, 0, 0));
        answer_labelB.setFont(new Font("MV Boli", Font.PLAIN, 20));

        buttonC.setBounds(20, 350, 75, 50);
        buttonC.setFont(new Font("MV Boli", Font.BOLD, 20));
        buttonC.setFocusable(false);
        buttonC.addActionListener(this);
        buttonC.setText("C");

        answer_labelC.setBounds(110, 350, 300, 50);
        answer_labelC.setBackground(new Color(224, 224, 224));
        answer_labelC.setForeground(new Color(0, 0, 0));
        answer_labelC.setFont(new Font("MV Boli", Font.PLAIN, 20));

        buttonD.setBounds(20, 400, 75, 50);
        buttonD.setFont(new Font("MV Boli", Font.BOLD, 20));
        buttonD.setFocusable(false);
        buttonD.addActionListener(this);
        buttonD.setText("D");

        answer_labelD.setBounds(110, 400, 300, 50);
        answer_labelD.setBackground(new Color(224, 224, 224));
        answer_labelD.setForeground(new Color(0, 0, 0));
        answer_labelD.setFont(new Font("MV Boli", Font.PLAIN, 20));

        seconds_left.setBounds(1000, 350, 80, 80);
        seconds_left.setBackground(new Color(224, 224, 224));
        seconds_left.setForeground(new Color(255, 0, 0));
        seconds_left.setFont(new Font("Ink Free", Font.BOLD, 50));
        seconds_left.setBorder(BorderFactory.createBevelBorder(1));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf(seconds));

        time_label.setBounds(1000, 250, 150, 25);
        time_label.setBackground(new Color(224, 224, 224));
        time_label.setForeground(new Color(255, 0, 0));
        time_label.setFont(new Font("MV Boli", Font.PLAIN, 15));
        time_label.setHorizontalAlignment(JTextField.CENTER);
        time_label.setText("Timp ramas");

        essayButton.setBounds(450, 450, 350, 100);
        essayButton.setFont(new Font("MV Boli", Font.BOLD, 20));
        essayButton.setFocusable(false);
        essayButton.addActionListener(this);
        essayButton.setText("Arata-mi eseul");
        essayButton.setEnabled(true);
        essayButton.setVisible(false);

        number_right.setBounds(225, 225, 200, 100);
        number_right.setBackground(new Color(224, 224, 224));
        number_right.setForeground(new Color(255, 0, 0));
        number_right.setFont(new Font("Ink Free", Font.BOLD, 50));
        number_right.setBorder(BorderFactory.createBevelBorder(1));
        number_right.setHorizontalAlignment(JTextField.CENTER);
        number_right.setEditable(false);

        percentage.setBounds(225, 325, 200, 100);
        percentage.setBackground(new Color(224, 224, 224));
        percentage.setForeground(new Color(255, 0, 0));
        percentage.setFont(new Font("Ink Free", Font.BOLD, 50));
        percentage.setBorder(BorderFactory.createBevelBorder(1));
        percentage.setHorizontalAlignment(JTextField.CENTER);
        percentage.setEditable(false);

        frame.add(time_label);
        frame.add(seconds_left);
        frame.add(answer_labelA);
        frame.add(answer_labelB);
        frame.add(answer_labelC);
        frame.add(answer_labelD);
        frame.add(buttonA);
        frame.add(buttonB);
        frame.add(buttonC);
        frame.add(buttonD);
        frame.add(questionNrField);
        frame.add(feedbackArea);
        frame.add(questionNrField);
        frame.add(questionsArea);

        frame.add(essayButton);
//        scrollPane.add(essayArea);
//        scrollPane.setBackground(new Color(0, 0, 0));
//        scrollPane.setBounds(1100, 0, 100, 100 );
//        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        scrollPane.setVisible(false);
//        scrollBar.setBackground(new Color(255, 0, 0));
//        scrollPane.add(scrollBar);

        frame.add(essayArea);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 750);
        frame.getContentPane().setBackground(new Color(255, 255, 255));
        frame.setLayout(null);
        frame.setResizable(true);
        frame.setVisible(true);

        nextQuestion();
    }

    public void nextQuestion() {
        if (index >= total_question) {
            results();
        } else {
            questionNrField.setText("Intrebarea numarul " + (index + 1));
            questionsArea.setText(questions[index]);
            answer_labelA.setText(options[index][0]);
            answer_labelB.setText(options[index][1]);
            answer_labelC.setText(options[index][2]);
            answer_labelD.setText(options[index][3]);
            timer.start();
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if (actionEvent.getSource() == essayButton) {
            essayButton.setVisible(false);
            showEssay();
        } else {

            if (actionEvent.getSource() == buttonA) {
                answer = 'A';
                if (answer == answers[index]) {
                    correct_guesses++;
                }
            }

            if (actionEvent.getSource() == buttonB) {
                answer = 'B';
                if (answer == answers[index]) {
                    correct_guesses++;
                }
            }

            if (actionEvent.getSource() == buttonC) {
                answer = 'C';
                if (answer == answers[index]) {
                    correct_guesses++;
                }
            }
            if (actionEvent.getSource() == buttonD) {
                answer = 'D';
                if (answer == answers[index]) {
                    correct_guesses++;
                }
            }
            displayAnswer();
        }

    }

    public void displayAnswer() {
        int t = 0;
        timer.stop();
        if (answer != answers[index]) {
            feedbackArea.setText(feedback[index]);
            t = 6500;

        } else {
            feedbackArea.setText("Răspuns corect!");
            t = 2000;
        }

        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);

        if (answers[index] != 'A') {
            answer_labelA.setForeground(new Color(255, 0, 0));
        }
        if (answers[index] != 'B') {
            answer_labelB.setForeground(new Color(255, 0, 0));
        }
        if (answers[index] != 'C') {
            answer_labelC.setForeground(new Color(255, 0, 0));
        }
        if (answers[index] != 'D') {
            answer_labelD.setForeground(new Color(255, 0, 0));
        }

        Timer pause = new Timer(t, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                answer_labelA.setForeground(new Color(0, 0, 0));
                answer_labelB.setForeground(new Color(0, 0, 0));
                answer_labelC.setForeground(new Color(0, 0, 0));
                answer_labelD.setForeground(new Color(0, 0, 0));
                feedbackArea.setText("");

                answer = ' ';
                seconds = 15;
                seconds_left.setText(String.valueOf(seconds));
                buttonA.setEnabled(true);
                buttonB.setEnabled(true);
                buttonC.setEnabled(true);
                buttonD.setEnabled(true);
                index++;
                nextQuestion();
            }
        }
        );
        pause.setRepeats(false);
        pause.start();
    }

    public void results() {
        buttonA.setEnabled(false);
        buttonB.setEnabled(false);
        buttonC.setEnabled(false);
        buttonD.setEnabled(false);
        buttonA.setVisible(false);
        buttonB.setVisible(false);
        buttonC.setVisible(false);
        buttonD.setVisible(false);
        time_label.setVisible(false);
        seconds_left.setVisible(false);

        result = (int) ((correct_guesses / (double) total_question) * 100);
        questionNrField.setText("Punctaj: ");
        if (result > 50) {
            questionsArea.setText("Acestea sunt rezultatele dumneavoastra. \n Felicitari! Ati trecut testul.");
        } else {
            questionsArea.setText("Acestea sunt rezultateele dumneavoastra. Va recomandam sa cititi eseul.");
        }

        answer_labelA.setText("");
        answer_labelB.setText("");
        answer_labelC.setText("");
        answer_labelD.setText("");

        number_right.setText("(" + correct_guesses + "/" + total_question + ")");
        percentage.setText(result + "%");
        essayButton.setVisible(true);
        frame.add(number_right);
        frame.add(percentage);
    }

    public void showEssay() {
        frame.remove(questionsArea);
        frame.remove(feedbackArea);
        frame.remove(essayButton);
        frame.remove(number_right);
        frame.remove(percentage);
        questionNrField.setText("Eseu");
        essayArea.setVisible(true);


    }



    public static void main(String[] args) {
        QuizEminescu quizEminescu = new QuizEminescu();
    }
};


