/*
    First, you need to start 'selenium server' before running the phpunit test

    IMPORTANT: Make sure you have the latest Selenium server running
    and then, update alias by going to the terminal and ENTER $mate ~/.bash_profile 

    Now copy and paste the following command into the terminal:
    $ selenium (alias) 
    Now press "Enter" and selenium server will start....

    To run the test, open a new "tab" in the terminal and enter following command: (path to the script)
    $ phpunit /Users/sayem/IdeaProjects/PHP/TestLogin.

    If for some reason phpunit test throw an exception: click on the link below for instruction: 
    http://sauceio.com/index.php/2011/02/how-to-do-selenium-with-phpunit-on-sauce/

 */



<?php
class WebTest extends PHPUnit_Extensions_Selenium2TestCase
{
    protected function setUp()
    {
        $this->setBrowser('firefox');
        $this->setBrowserUrl('http://www.totsy.com/');
    }
 
    public function testTitle()
    {
        $this->url('http://www.totsy.com/');
        $this->assertEquals('Customer Login');
        $this->title();
    }
 
}
?>
