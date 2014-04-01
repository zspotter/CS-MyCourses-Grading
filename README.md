This repo contains a few simple bash scripts intended to make the life of an RIT Computer Science grader easier. All files should have documentation contained in the head.

I'm far from being a bash-master, so I will eagerly accept bug reports and pull requests.

A basic walkthrough of how I use these scripts follows.

**Unpacking the MyCourses zip:** `unpacklab LAB-ZIP`
- Download the lab mega-zip from MyCourses. We'll assume it's called *"Lab 05 Download Mar 29, 2014 1242 PM.zip"*
- Neatly inflate the zip by executing `unpacklab Lab\ 05\ Download\ Mar\ 29,\ 2014\ 1242\ PM.zip`
    - A new folder, *submissions/*, now contains a folder for each student's latest submission
    - If a student's submission was a zip, it will be unzipped. The folder structure inside the zip wil be preserved.
    - If a student submitted multiple files individually, only the most recent submission will be saved 
- Run `tree submissions/` to make sure everything looks right

**Flattening submission directories:** `flatten DIR...`
- If a student's submission contained any folders in a zip, you can flatten and remove all subdirectories by executing flatten.
- To flatten a single submission, execute `flatten submissions/PotterZachary/`
- To flatten each submission directory, execute `flatten submissions/*`
    - Don't run `flatten submissions/` or all submissions will be squished together!

**Running test programs on submissions:** `testlab SOURCE-DIR SUBMISSION-DIR...`
- The goal of the *testlab* program is to apply generic tests from the SOURCE-DIR to each SUBMISSION-DIR.
    - Tests are not meant to be interactive. 
    - Test output is saved in each SUBMISSION-DIR. 
    - In order to specify how to run tests, the SOURCE-DIR must contain a *testsubmission* executable. Each week's lab will have a different *testsubmission* to run the unique tests for that lab. 
        - Look in *example/source/* to see how this can work.
- It is important to note that in testing, files with the same name in SUBMISSION-DIR and SOURCE-DIR will always use the SOURCE-DIR file.
- To test a single submission, `testlab source/ submissions/PotterZachary/`
- To test all submissions, `testlab source/ submissions/*`
