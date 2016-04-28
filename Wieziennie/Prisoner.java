package Wieziennie;



public class Prisoner {

		private static int id = 0;
		private static int genId;
		private String name;
		enum  Felony {MURDER, THEFT, ROBBERY, DRUGS, OTHER};
		private Wieziennie.Prisoner.Felony felony;
		
		public static int getId() {
			return id;
		}
		
		static {
			id = genId;
			genId++;
		}

		public String getName() {
			return name;
		}

		public Wieziennie.Prisoner.Felony getFelony() {
			return felony;
		}
		
		public Prisoner(){
			
		}
		
		public Prisoner(String name, Felony felony) {
			this.name = name;
			this.felony = felony;
		}


}