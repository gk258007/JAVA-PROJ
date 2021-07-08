class MovieList
{
public static void main(String args[])
{
fetch("https://www.reddit.com/r/javascript/top/.json?limit=5");
.then(res=>res.json());
.then(json=>console.log(json));
}
demo('javascript');
}
}