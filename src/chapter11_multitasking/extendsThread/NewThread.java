package chapter11_multitasking.extendsThread;

class NewThread extends Thread
{

	NewThread()
	{
		super("Demo Thread");
		System.out.println("Branch thread created: " + this);
		start();
	}

	public void run()
	{
		try
		{
			for (int i=5;i > 0;i--)
			{
				System.out.println("Branch thread: " + i);
				Thread.sleep(500);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("The branch thread interrupted");
		}
		System.out.println("Branch thread end");
	}
}
