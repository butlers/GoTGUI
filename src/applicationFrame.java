import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTabbedPane;
import javax.swing.JRadioButton;
import javax.swing.JList;
import java.awt.Choice;
import javax.swing.JComboBox;

public class applicationFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					applicationFrame frame = new applicationFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public applicationFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(19, 20, 403, 234);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Characters", null, panel, null);
		panel.setLayout(null);
		
		JList statusList = new JList();
		statusList.setBounds(6, 39, 113, 143);
		panel.add(statusList);
		
		JList religionList = new JList();
		religionList.setBounds(131, 39, 120, 143);
		panel.add(religionList);
		
		JList titleList = new JList();
		titleList.setBounds(263, 39, 113, 143);
		panel.add(titleList);
		
		String[] statusChoices = {"alive", "dead", "resurrected"};
		JComboBox status = new JComboBox(statusChoices);
		status.setBounds(6, 6, 113, 27);
		panel.add(status);
		
		String[] religionChoices = {"populate", "through", "db"};
		JComboBox religion = new JComboBox(religionChoices);
		religion.setBounds(131, 6, 120, 27);
		panel.add(religion);
		
		String[] titleChoices = {"pop", "through", "db"};
		JComboBox title = new JComboBox(titleChoices);
		title.setBounds(263, 6, 113, 27);
		panel.add(title);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Houses", null, panel_1, null);
		panel_1.setLayout(null);
		
		String[] houseStatusChoices = {"Status"};
		JComboBox houseStatus = new JComboBox(houseStatusChoices);
		houseStatus.setBounds(6, 6, 113, 27);
		panel_1.add(houseStatus);
		
		JList list = new JList();
		list.setBounds(6, 32, 113, 150);
		panel_1.add(list);
		
		JList list_1 = new JList();
		list_1.setBounds(131, 32, 113, 150);
		panel_1.add(list_1);
		
		JList list_2 = new JList();
		list_2.setBounds(256, 32, 113, 150);
		panel_1.add(list_2);
		
		String[] wordsChoices = {"words"};
		JComboBox words = new JComboBox(wordsChoices);
		words.setBounds(131, 6, 113, 27);
		panel_1.add(words);
		
		String[] bannerChoices = {"banner"};
		JComboBox banner = new JComboBox(bannerChoices);
		banner.setBounds(256, 6, 113, 27);
		panel_1.add(banner);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Relationships", null, panel_2, null);
		panel_2.setLayout(null);
		
		String[] hasRelationshipWithChoices = {"other char"};
		JComboBox hasRelationshipWith = new JComboBox(hasRelationshipWithChoices);
		hasRelationshipWith.setBounds(6, 6, 82, 27);
		panel_2.add(hasRelationshipWith);
		
		String[] relationshipStatusChoices = {"status"};
		JComboBox Status = new JComboBox(relationshipStatusChoices);
		Status.setBounds(100, 6, 82, 27);
		panel_2.add(Status);
		
		String[] neutralityChoices = {"neutrality"};
		JComboBox Neutrality = new JComboBox(neutralityChoices);
		Neutrality.setBounds(194, 6, 82, 27);
		panel_2.add(Neutrality);
		
		String[] descriptionChoices = {"description"};
		JComboBox Description = new JComboBox(descriptionChoices);
		Description.setBounds(288, 6, 82, 27);
		panel_2.add(Description);
		
		JList hasRelationshipWithList = new JList();
		hasRelationshipWithList.setBounds(6, 45, 82, 137);
		panel_2.add(hasRelationshipWithList);
		
		JList relationshipStatusList = new JList();
		relationshipStatusList.setBounds(100, 45, 82, 137);
		panel_2.add(relationshipStatusList);
		
		JList neutralityList = new JList();
		neutralityList.setBounds(194, 45, 82, 137);
		panel_2.add(neutralityList);
		
		JList descriptionList = new JList();
		descriptionList.setBounds(288, 45, 82, 137);
		panel_2.add(descriptionList);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Factions", null, panel_3, null);
		panel_3.setLayout(null);
		
		String[] factionNameChoices = {"Faction Name"};
		JComboBox factionName = new JComboBox(factionNameChoices);
		factionName.setBounds(6, 6, 113, 27);
		panel_3.add(factionName);
		
		String[] leaderChoices = {"Leader"};
		JComboBox leader = new JComboBox(leaderChoices);
		leader.setBounds(131, 6, 113, 27);
		panel_3.add(leader);
		
		String[] factionStatusChoices = {"Status"};
		JComboBox factionStatus = new JComboBox(factionStatusChoices);
		factionStatus.setBounds(256, 6, 113, 27);
		panel_3.add(factionStatus);
		
		JList factionList = new JList();
		factionList.setBounds(6, 39, 113, 143);
		panel_3.add(factionList);
		
		JList leaderList = new JList();
		leaderList.setBounds(131, 39, 113, 143);
		panel_3.add(leaderList);
		
		JList factionStatusList = new JList();
		factionStatusList.setBounds(256, 39, 113, 143);
		panel_3.add(factionStatusList);
	}
}
