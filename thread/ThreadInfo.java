package thread;

public class ThreadInfo {
	public static void main(String[] args) {
		Thread t = new Thread("My THREAD");
		log("",t);
	}

	private static void log(String indent, Thread t) {
		// TODO Auto-generated method stub
		System.out.println(indent +"Thread name:"+t.getName());
		System.out.println(indent +"ID:"+t.getId());
		System.out.println(indent + "Priority:"+t.getPriority());
		System.out.println(indent + "State :"+t.getState());
		System.out.println(indent +"Thread Group:"+t.getThreadGroup().getName());
		System.out.println(indent +"Is alive: "+t.isAlive());
		System.out.println(indent +"Is Daemon: "+t.isDaemon()+"/n");
		
	}
	public static void info(String indent,ThreadGroup tg) {
		int threadcount = tg.activeCount();
		Thread[]threads= new Thread[threadcount];
		tg.enumerate(threads);
		System.out.println(indent +"Thread Group name"+ tg.isDaemon());
		for (int i = 0; i < threads.length; i++) {
		
		}
		int groupCount = tg.activeCount();
		ThreadGroup[]groups = new ThreadGroup[groupCount];
		tg.enumerate(groups);
		for (int i = 0; i < groups.length; i++) {
			info(indent+"/t"+groups[i], tg);
		}
	}

}
