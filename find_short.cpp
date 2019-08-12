int find_short(std::string str){
    list<string> words;
    std::istringstream ist(str);
    std::string tmp;
    while (ist >> tmp)
        words.push_back(tmp);
    int lengthStr = INT_MAX;
    for (auto elem : words) {
        if (elem.length() < lengthStr)
            lengthStr = elem.length();
    }
    return lengthStr;
}