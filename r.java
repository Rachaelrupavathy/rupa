string lcp(vector<string> str) 
{
    if (str.size() == 0) 
        return "";
 
    string res = "";
 
    for (int i = 0; i < str[0].length(); i++) 
    {
        // checking if character i qualifies to be in the reswer. 
        bool ok = true; 
        for (int j = 1; j < str.size(); j++) 
        {
            if (i >= str[j].length() || str[j][i] != str[0][i]) 
            {
                ok = false;
                break;
            }
        }
        if (!ok) break;
        res.push_back(str[0][i]);
    }
    return res;
}
