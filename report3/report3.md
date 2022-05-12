# Yucheng's Week 6 Lab Report 3
In this week's report, I will write about some implementation of all Group Choice Options in lab 5. I will show how I did them in this report. Let's start with the first one.
<img src="dou.PNG" width="50%"></img>
## The first one: Streamlining ssh Configuration
First I will show how I edit my `.ssh/config` file. Here is the screenshot of my code:![ssh](ssh-config.PNG)
I create a new file like this and put these codes into this file, this directly tells `ssh` to log into my account.
Then the ssh command logging into my account using just the alias I chose:
![ssh](ssh.PNG)
Then we can also directly using scp with the alias I chose:
![scp](scp.PNG)
This case we copy test-file.md from my computer to the account.
## The second one: Setup Github Access from ieng6
This is where I store public key in Github:
![git](github.PNG)
And this is where in my school account:
![account](12.PNG)
the 12.pub is the public key and the 12 is the private key.

After making some changes, I apply git command:
![g](git.PNG)
## The third one: Copy whole directories with scp -r
For my own case, I copy the whole cse15l directory to my ieng6 account:
![scp](scp-r.PNG)
![ls](ieng6ls.PNG)
Then we try compile and run the test in my account:
![test](test.PNG)
We success!
Just like what we did in lab 1, we can use `;` to combine command in one line and `""` to use command after log in:
![scp-test](multi1.PNG)
![scp-test](multi2.PNG)
It will do the things we did seperately above in one line.
# The End
![dc](dead-cells.PNG)