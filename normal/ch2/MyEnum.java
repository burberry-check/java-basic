package ch2;

class MyEnum {
	public static void main(String[] args) {
		FrontTeam frontTeam = FrontTeam.APP;
		System.out.println(frontTeam.name());	// enum name
		System.out.println(frontTeam.ordinal());	// index
		
		CommandEnum commandEnum = CommandEnum.START;
		System.out.println(commandEnum.name()); // print 'START'
        System.out.println(commandEnum.getCommand()); // print 'start'
        System.out.println(commandEnum.getOpt()); // print 'opt'
        System.out.println(commandEnum.ordinal()); // print 'opt'
	}
	
    public enum FrontTeam {
        SHOP, TOUR, APP
    }
	
    public enum CommandEnum {
        START("start", "gogogo"),
        STOP("stop", "end"); // watch out. need semi-colon.

        private String command;
        private String opt;

        CommandEnum(String command, String opt){
            this.command = command;
            this.opt = opt;
        }
        public String getCommand(){ return this.command; }
        public String getOpt(){ return this.opt; }
    }
}


