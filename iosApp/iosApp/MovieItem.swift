//
//  MovieItem.swift
//  iosApp
//
//  Created by Mamikos on 29/11/20.
//  Copyright © 2020 orgName. All rights reserved.
//

import UIKit
import movieApi
import Nuke

class MovieItem: UICollectionViewCell {
    let imgCover: UIImageView = {
        let v = UIImageView()
            
        v.translatesAutoresizingMaskIntoConstraints = false
        v.contentMode = .scaleAspectFill
        v.clipsToBounds = true
            
        return v
    }()
        
    let lblTitle: UILabel = {
        let v = UILabel()
        
        v.translatesAutoresizingMaskIntoConstraints = false
        v.numberOfLines = 2
        v.textAlignment = .center
            
        return v
    }()
        
    var movie: Movie? {
        didSet {
            guard let movie = movie else { return }
            
            if let poster = URL(string: movie.fullPosterPath) {
                    Nuke.loadImage(with: poster, into: imgCover)
            }
                
            lblTitle.text = movie.title
        }
    }
        
    required init(coder aDecoder: NSCoder) {
        fatalError("init(coder:)")
    }
        
    override init(frame: CGRect) {
        super.init(frame: frame)
        
        contentView.addSubview(imgCover)
        contentView.addSubview(lblTitle)
            
        NSLayoutConstraint.activate([
            imgCover.leadingAnchor.constraint(equalTo: contentView.leadingAnchor),
            imgCover.topAnchor.constraint(equalTo: contentView.topAnchor),
            imgCover.trailingAnchor.constraint(equalTo: contentView.trailingAnchor),
            imgCover.heightAnchor.constraint(equalToConstant: 200),
                
            lblTitle.leadingAnchor.constraint(equalTo: contentView.leadingAnchor, constant: 10),
            lblTitle.trailingAnchor.constraint(equalTo: contentView.trailingAnchor, constant: -10),
            lblTitle.topAnchor.constraint(equalTo: imgCover.bottomAnchor, constant: 10)
        ])
    }
}
